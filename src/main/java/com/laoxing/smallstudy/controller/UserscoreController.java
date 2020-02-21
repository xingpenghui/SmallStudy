package com.laoxing.smallstudy.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.laoxing.smallstudy.entity.Userscore;
import com.laoxing.smallstudy.service.UserscoreService;
import com.laoxing.smallstudy.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author laoxing
 * @since 2020-02-21
 */
@RestController
@RequestMapping("/userscore")
public class UserscoreController {
    @Autowired
    private UserscoreService service;

    //查询
    @GetMapping("/all.do")
    public R all(int uid){
        return R.ok(service.list(new QueryWrapper<Userscore>().eq("uid",uid)));
    }

}
