package com.sparta.spring_mvc.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello world!!";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "hello world!!!";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post() {
        return "포스트 요청입니다";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put() {
        return "PUT 요청";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete() {
        return "delete 요청";
    }
}
