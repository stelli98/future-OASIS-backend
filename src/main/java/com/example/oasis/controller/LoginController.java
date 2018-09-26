package com.example.oasis.controller;

import com.example.oasis.model.Employee;
import com.example.oasis.model.LoginModel;
import com.example.oasis.serviceImpl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    LoginServiceImpl loginServiceImpl;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Employee callLoginService(@RequestBody LoginModel model){
        return loginServiceImpl.findLoginCredentials(model.getUsername(), model.getPassword());
    }
}
