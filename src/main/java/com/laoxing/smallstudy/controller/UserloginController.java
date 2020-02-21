package com.laoxing.smallstudy.controller;


import com.laoxing.smallstudy.service.UserloginService;
import com.laoxing.smallstudy.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
@RequestMapping("/userlogin")
public class UserloginController {
    @Autowired
    private UserloginService service;

    @GetMapping("/login.do")
    public R login(String code){
        return service.login(code);
    }


}
