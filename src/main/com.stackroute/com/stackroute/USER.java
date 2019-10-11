package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class USER {
    @RequestMapping("/login")
    public ModelAndView InputUser(HttpServletRequest req, HttpServletResponse res){
        user user=new user();
        user.setName(req.getParameter("MyName"));
        user.setPassword(req.getParameter("Password"));


        ModelAndView modelAndView=new ModelAndView("display");
        modelAndView.addObject("value",user.toString());
        return  modelAndView;
    }

}
