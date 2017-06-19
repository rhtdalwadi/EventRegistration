package com.rohit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rohit.model.Employee;
import com.rohit.service.EmployeeService;
import static com.rohit.util.ERConstants.*;

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
      switch (getEmployeePrivilege(employee)) {
        case ROLE_ADMIN:
          mv = redirectToPage(employee, "adminPage");
          break;
        case ROLE_EMPLOYEE:
          mv = redirectToPage(employee, "EventRegistration");
        default:
          mv = redirectToPage(employee, "index");
          break;
      }
    }
    return mv;
  }

  private ModelAndView redirectToPage(Employee employee, String page) {
    ModelAndView mv = new ModelAndView(page);
    mv.addObject("employee", employee);
    return mv;
  }

  private String getEmployeePrivilege(Employee employee) {
    
    return null;
  }
}
