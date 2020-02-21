package com.laoxing.smallstudy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.laoxing.smallstudy.entity.Books;
import com.laoxing.smallstudy.dao.BooksMapper;
import com.laoxing.smallstudy.service.BooksService;
import com.laoxing.smallstudy.vo.R;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author laoxing
 * @since 2020-02-21
 */
@Service
public class BooksServiceImpl extends ServiceImpl<BooksMapper, Books> implements BooksService {


    @Override
    public R queryList(String name) {
        QueryWrapper<Books> wrapper=new QueryWrapper<>();
        if(name!=null && name.length()>0){
            //Mybatis-plus 条件构造器 类似 Mybatis Example
            //条件查询
           wrapper.like("bkname","%"+name+"%").or().like("bkauthor","%"+name+"%");
        }
        return R.ok(getBaseMapper().selectList(wrapper));
    }

    @Override
    public R queryByUid(String uid) {
        return R.ok(getBaseMapper().queryUid(uid));
    }

    @Override
    public R checkBook(String uid, int bid) {

        return R.setR(getBaseMapper().queryUidBid(uid, bid)==0);
    }

}
