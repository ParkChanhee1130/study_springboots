package com.study.study_springboots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

 @Controller
public class BoardOurController {
    @RequestMapping(value = "/board/form", method = RequestMethod.GET)
    public String form() {
        return "board/form";
    }
    @RequestMapping(value = "/board/form", method = RequestMethod.POST)
    public String formPost() {
        // insert biz
        return "board/list";
    }
}