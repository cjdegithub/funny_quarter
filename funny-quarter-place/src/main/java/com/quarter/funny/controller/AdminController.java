package com.quarter.funny.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 */
@Controller
public class AdminController {

    private final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @RequestMapping(value = "encrypte", method = RequestMethod.GET)
    public void encrypte() {
//    	String url = "https://www.zhihu.com/";
    }
    
    
    
    @RequestMapping(value = "welcome", method = RequestMethod.GET)
    public String welcome(HttpServletResponse response) {
        String name = "aaa";
        String mehond = "index";
        logger.info("name:{} method:{} {}", name,mehond);
        
        try {
			response.sendRedirect("https://www.baidu.com/");
		} catch (IOException e) {
			e.printStackTrace();
		}
//        return "redirect: https://www.baidu.com/";
        return "welcome";
    }
    
    @RequestMapping(value = "init", method = RequestMethod.GET)
    public ModelAndView inits(HttpServletResponse response) {
       return new ModelAndView(new RedirectView("http://baidu.com"));
    }
    
}
