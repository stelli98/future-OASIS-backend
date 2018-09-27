package com.example.oasis.serviceImplementations;

import com.example.oasis.models.Employee;
import com.example.oasis.repositories.LoginRepository;
import com.example.oasis.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginRepository loginRepository;

    @Override
    public Employee findLoginCredentials(String username, String password) {
        return loginRepository.findByUsernameAndPassword(username, password);
    }
}
