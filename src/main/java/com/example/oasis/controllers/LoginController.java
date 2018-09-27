package com.example.oasis.controllers;

import com.example.oasis.models.Employee;
import com.example.oasis.models.LoginModel;
import com.example.oasis.serviceImplementations.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @Autowired
    private LoginServiceImpl loginServiceImpl;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView callLoginService(@RequestParam String username, @RequestParam String password){
        Employee result = loginServiceImpl.findLoginCredentials(username, password);
        ModelAndView modelAndView = new ModelAndView("login", "username", result.getUsername());
        modelAndView.addObject("fullname", result.getFullname());
        modelAndView.addObject("jobTitle", result.getJobTitle());
        modelAndView.addObject("division", result.getDivision());
        return modelAndView;
    }
}
