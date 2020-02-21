package com.laoxing.smallstudy.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.laoxing.smallstudy.entity.Comment;
import com.laoxing.smallstudy.service.CommentService;
import com.laoxing.smallstudy.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author laoxing
 * @since 2020-02-21
 */
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService service;

    @PostMapping("/save.do")
    public R save(@RequestBody Comment comment){
        return R.setR(service.save(comment));
    }
    @GetMapping("/querybid.do")
    public R queryByBid(int bid){
        return R.ok(service.list(
                new QueryWrapper<Comment>().eq("bkid",bid)));
    }

    @GetMapping("/queryuid.do")
    public R queryByUid(int uid){
        return R.ok(service.list(
                new QueryWrapper<Comment>().eq("uid",uid)));
    }



}
