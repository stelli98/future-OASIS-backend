package com.example.oasis.controllers;

import com.example.oasis.models.Employee;
import com.example.oasis.models.LoginModel;
import com.example.oasis.serviceImplementations.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginServiceImpl loginServiceImpl;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Employee callLoginService(@RequestBody LoginModel model) {
        return loginServiceImpl.findLoginCredentials(model.getUsername().toLowerCase(), model.getPassword());
    }
}
