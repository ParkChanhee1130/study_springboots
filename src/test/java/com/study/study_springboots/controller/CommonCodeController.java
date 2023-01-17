package com.study.study_springboots.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/commonCode")
public class CommonCodeController {
    
    @Autowired
    CommonDao commonDao;

    @RequestMapping(value = "/list")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        Object commonData = commonDao.getCommonList();
        modelAndView.addObject("commonData", commonData);
        modelAndView.setViewName("/CommonCode/list");
        return modelAndView;
    }
}
