package com.study.study_springboots.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.dao.CommonDao;

@Controller
@RequestMapping(value = "/commonCode")
public class CommonCodeController {
    
    @Autowired
    CommonDao commonDao;

    @RequestMapping(value = {"/list", "/", ""}, method = RequestMethod.GET)
    public ModelAndView list(@RequestParam Map<String, Object> params, ModelAndView modelAndView) {
        modelAndView.setViewName("commonCode_our/list");
        return modelAndView;
    }
}
