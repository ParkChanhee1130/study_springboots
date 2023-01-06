package com.study.study_springboots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// * Cast 
// - use bootstrap
// - 항목 : title, content,userName, date
// - CRUD : 
//   + list.jsp(/board) -> view.jsp(/board_our/view) -> list.jsp(/board_our/list)
//   + list.jsp(/board) -> form.jsp(/board_our/form) -> list.jsp(/board_our/save) with Post
//   + view.jsp(/board_our/view) -> edit.jsp(/board_our/edit) -> list.jsp(/board_our/save)
@Controller
public class BoardOutRController {
    
    public class BoardOurController {
        @RequestMapping(value = "/edit", method = RequestMethod.POST)  
        public ModelAndView edit(ModelAndView modelAndView) {
            modelAndView.setViewName("board_our/edit");
            return modelAndView;
        }
        @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)  
        public ModelAndView list() {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("firstString", "firstValue");
            modelAndView.setViewName("board_our/list");
            return modelAndView;    // --> Dispatcher Servlet
        }
        @RequestMapping(value = "/view", method = RequestMethod.GET)  
        public ModelAndView view(ModelAndView modelAndView) {
            modelAndView.setViewName("board_our/view");
            return modelAndView;
        }
        @RequestMapping(value = "/form", method = RequestMethod.GET)    
        public ModelAndView form(ModelAndView modelAndView) {
            modelAndView.setViewName("board_our/form");
            return modelAndView;
        }
        @RequestMapping(value = "/save", method = RequestMethod.POST)    
        public ModelAndView save(ModelAndView modelAndView) {
            // insert biz
            modelAndView.setViewName("board_our/list");
            return modelAndView;
        }
}