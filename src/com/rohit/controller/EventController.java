package com.rohit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rohit.model.Event;

@Controller
public class EventController {

  @RequestMapping("openEventRegistrationForm")
  public ModelAndView openEventRegistrationForm(@RequestParam("empId") String empId) {
    ModelAndView mv = new ModelAndView("EventRegistration");
    System.out.println(empId);
    mv.addObject("empId", empId);
    return mv;
  }

  @RequestMapping(value = "registerEvent", method = RequestMethod.POST)
  public ModelAndView registerEvent(@ModelAttribute("event") Event event, BindingResult results) {
    if (results.hasErrors()) {
      System.out.println(results.getErrorCount());
    }
    ModelAndView mv = new ModelAndView("SuccessfullyRegisterd");
    return mv;


  }

}
