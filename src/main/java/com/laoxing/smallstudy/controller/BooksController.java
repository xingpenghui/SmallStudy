package com.laoxing.smallstudy.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.laoxing.smallstudy.entity.Books;
import com.laoxing.smallstudy.service.BooksService;
import com.laoxing.smallstudy.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.awt.print.Book;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author laoxing
 * @since 2020-02-21
 */
@RestController
@RequestMapping("/books")
public class BooksController {
    @Autowired
    private BooksService service;

    @RequestMapping("/save.do")
    public R save(@RequestBody Books books){
        return R.setR(service.save(books));
    }
    @RequestMapping("queryAll.do")
    public R all(){
        return R.ok(service.list());
    }
    //分页查询
    @RequestMapping("page.do")
    public R page(int page,int size){
        return R.ok(service.page(new Page<>(page,size)));
    }
    @GetMapping("searchbooks.do")
    public R search(String name){
        return service.queryList(name);
    }
       //查询用户已买的书籍信息
    @GetMapping("querybyuid.do")
    public R all(String uid){
        return service.queryByUid(uid);
    }
    //检查是否购买过书 没有买过 返回成功
    @GetMapping("checkbook.do")
    public R check(String uid,int bid){
        return service.checkBook(uid, bid);
    }
}
