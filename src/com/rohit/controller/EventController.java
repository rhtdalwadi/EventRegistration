package com.rohit.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventController
{

    /*@RequestMapping("/welcome/country/{username}")
    public ModelAndView handleRequestInternal(@PathVariable Map<String,String> pathVars) {
        ModelAndView model = new ModelAndView("HelloPage");
        model.addObject("msg","Hello world greet from "+pathVars.get("username"));
        return model;
    }*/
    @RequestMapping("/index")
    public ModelAndView displayHomePage() {
        ModelAndView model = new ModelAndView("index");
        model.addObject("You are successfully registered with Event");
        return model;
    }
    
    @RequestMapping("openEventRegistrationForm")
    public ModelAndView openEventRegistrationForm(@RequestParam("empId") String empId) {
      ModelAndView mv = new ModelAndView("EventRegistration");
      System.out.println(empId);
      mv.addObject("empId", empId);
      return mv;
    }
    
    public void submitEvent()
    {
      
    }

}