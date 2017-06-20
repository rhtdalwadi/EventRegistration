package com.rohit.controller;

import static com.rohit.util.ERConstants.ROLE_ADMIN;
import static com.rohit.util.ERConstants.ROLE_EMPLOYEE;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rohit.model.Employee;
import com.rohit.model.RolesDefination;
import com.rohit.service.EmployeeService;


@Controller
public class LoginController {

  @Autowired
  EmployeeService employeeService;

  @RequestMapping("/index")
  public ModelAndView displayHomePage() {
    ModelAndView model = new ModelAndView("index");
    model.addObject("You are successfully registered with Event");
    return model;
  }

  @RequestMapping(value = "/login")
  public ModelAndView login(@RequestParam("empId") String empId) {
    ModelAndView mv = null ;

    Employee employee = employeeService.findEmployeeById(empId);
    if (employee != null) {
      
      if(employeeHasRole(employee,ROLE_ADMIN))
      {
        mv = redirectToPage(employee, "adminPage");
      }
      else if(employeeHasRole(employee,ROLE_EMPLOYEE))
      {
        mv = redirectToPage(employee, "EventRegistration");
      }
    }
    else
    {
      mv = redirectToPage(employee, "index");
    }
    return mv;
  }

  private ModelAndView redirectToPage(Employee employee, String page) {
    ModelAndView mv = new ModelAndView(page);
    mv.addObject("employee", employee);
    return mv;
  }

  private boolean employeeHasRole(Employee employee,String employeeRole) {
    return employeeService.employeeHasRole(employee, employeeRole);
  }
}
