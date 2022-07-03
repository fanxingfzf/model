package com.fzf.msp.controller;


import com.fzf.msp.commons.R;
import com.fzf.msp.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger=LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public R login(){
        logger.info("system userService start");
        R allUser = userService.findAllUser();
//        logger.info("system userService end");
//        logger.info("system find all user success");
        return R.success();
    }
}
