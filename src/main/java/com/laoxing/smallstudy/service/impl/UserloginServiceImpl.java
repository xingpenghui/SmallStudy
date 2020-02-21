package com.laoxing.smallstudy.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.laoxing.smallstudy.dao.UsersMapper;
import com.laoxing.smallstudy.dao.UserscoreMapper;
import com.laoxing.smallstudy.dto.WxLoginDto;
import com.laoxing.smallstudy.entity.Userlogin;
import com.laoxing.smallstudy.dao.UserloginMapper;
import com.laoxing.smallstudy.entity.Users;
import com.laoxing.smallstudy.entity.Userscore;
import com.laoxing.smallstudy.service.UserloginService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.laoxing.smallstudy.vo.R;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author laoxing
 * @since 2020-02-21
 */
@Service
public class UserloginServiceImpl extends ServiceImpl<UserloginMapper, Userlogin> implements UserloginService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private UserscoreMapper scoreMapper;
    //https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code
    @Override
    @Transactional
    public R login(String code) {
        //1、校验参数
        if(code!=null && code.length()>0){
            //2、组装 微信需要的参数
            //Appid: wx81fc83a4c6bc3338
            //AppSecret：5a5a9a115c041f8c955aefcb9534bd0e
           String json= restTemplate.getForObject("https://api.weixin.qq.com/sns/jscode2session?appid=wx81fc83a4c6bc3338&secret=5a5a9a115c041f8c955aefcb9534bd0e&js_code="+code+"&grant_type=authorization_code",String.class);
            //3、解析结果
            WxLoginDto loginDto= JSON.parseObject(json,WxLoginDto.class);
            if(loginDto.getErrcode()==0){
                //4、登录成功  做什么
                //1.是不是第一次登录
                //第一次登录 1.新增用户信息 到数据 2.新用户奖励
                Users users=usersMapper.selectOne(new QueryWrapper<Users>().
                        eq("uid",loginDto.getOpenid()));
                int score=0;
                String smsg;
                if(users!=null){
                    //老用户
                    //1.校验连续登录的天数 (留给你了)  彩蛋 和每日 首次登录 奖励积分
                    // 现状：登录成功就奖励10积分
                    score=10;
                    smsg="登录奖励";
                    usersMapper.updateSocre(loginDto.getOpenid(),score);
                }else {
                    score=100;
                    smsg="注册奖励";
                    //新用户
                    users=new Users();
                    users.setSessionkey(loginDto.getSession_key());
                    users.setUid(loginDto.getOpenid());
                    users.setUbalance(score);
                    users.setCreate_time(new Date());
                    usersMapper.myinsert(users);
                }

                //1.新增登录信息
                Userlogin userlogin=new Userlogin();
                userlogin.setUid(loginDto.getOpenid());
                userlogin.setDays(1);//1
                userlogin.setCtime(new Date());
                getBaseMapper().insert(userlogin);
                //2.新增积分
                Userscore userscore=new Userscore();
                userscore.setCtime(new Date());
                userscore.setInfo(smsg);
                userscore.setScore(score);
                userscore.setUid(loginDto.getOpenid());
                scoreMapper.insert(userscore);
                //记得将openId 返回给小程序
                return R.ok(loginDto.getOpenid());

            }else {
                return R.fail(loginDto.getErrmsg());
            }
        }else {
            return R.fail("请传递code");
        }
    }
}
