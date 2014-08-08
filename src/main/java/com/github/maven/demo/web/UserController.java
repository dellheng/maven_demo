package com.github.maven.demo.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value="/getUser.do")  
    public ModelAndView getUser(HttpServletRequest request,HttpServletResponse response){
    	String name = request.getParameter("name");
    	
    	//再加点东西
    	return new ModelAndView("index","name",name);
    }
    
    @RequestMapping(value="/saveUser.do")  
    public ModelAndView saveUser(HttpServletRequest request,HttpServletResponse response){
    	return null;
    }
    
    @RequestMapping(value="/deleteUser.do")  
    public ModelAndView deleteUser(HttpServletRequest request,HttpServletResponse response){
    	return null;
    }
}
