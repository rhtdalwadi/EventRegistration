package com.rohit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rohit.daoimpl.EmployeeDaoImpl;
import com.rohit.model.Employee;
import com.rohit.service.EmployeeService;

@Controller
public class LoginController {
  
  @Autowired
  EmployeeService employeeService ;
  
  @RequestMapping("/index")
  public ModelAndView displayHomePage() {
    ModelAndView model = new ModelAndView("index");
    model.addObject("You are successfully registered with Event");
    return model;
  }
  
  @RequestMapping(value="/login")
  public ModelAndView login(@RequestParam("empId") String empId)
  {
    Employee employee = employeeService.findEmployeeById(empId);
    System.out.println(employee.getEmpFirstName());
    
    ModelAndView mv = new ModelAndView("EventRegistration");
    mv.addObject("empId", empId);
    return mv;
  }
}
