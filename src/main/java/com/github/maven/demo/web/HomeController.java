package com.github.maven.demo.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {  
  
	private static Log log = LogFactory.getLog(HomeController.class);
	
    @RequestMapping(value="/index.do")  
    public ModelAndView index(HttpServletRequest request,HttpServletResponse response){
    	String name = request.getParameter("name");
    	log.info(name + "访问了系统");
    	return new ModelAndView("index","name",name);
    }
    
    @RequestMapping(value="/hello.do")  
    public ModelAndView hello(HttpServletRequest request,HttpServletResponse response){
    	String name = request.getParameter("name");
    	log.info(name + "访问了系统");
    	return new ModelAndView("index","name",name);
    } 
}