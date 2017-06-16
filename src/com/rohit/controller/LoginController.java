package com.rohit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
  
  @RequestMapping("/index")
  public ModelAndView displayHomePage() {
    ModelAndView model = new ModelAndView("index");
    model.addObject("You are successfully registered with Event");
    return model;
  }
  
  @RequestMapping(value="/login")
  public ModelAndView login(@RequestParam("empId") String empId)
  {
    ModelAndView mv = new ModelAndView("EventRegistration");
    mv.addObject("empId", empId);
    return mv;
  }
}
