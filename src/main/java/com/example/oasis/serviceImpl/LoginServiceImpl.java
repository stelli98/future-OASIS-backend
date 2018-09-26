package com.example.oasis.serviceImpl;

import com.example.oasis.model.Employee;
import com.example.oasis.repository.LoginRepository;
import com.example.oasis.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginRepository loginRepository;

    @Override
    public Employee findLoginCredentials(String username, String password) {
        return loginRepository.findByUsernameAndPassword(username, password);
    }
}
