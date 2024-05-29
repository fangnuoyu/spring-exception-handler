package com.fny.ex.controller;

import com.fny.ex.core.R;
import com.fny.ex.exception.UserNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Name UserController
 * @Description UserController
 * @Author HRT
 * @Date 2024/5/29 11:08
 * @Version 1.0.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hello")
    public R<String> hello() {
        throw new UserNotFoundException("User not found with id");
//        return new R<String>(0, "请求成功", "hello");
    }
}
