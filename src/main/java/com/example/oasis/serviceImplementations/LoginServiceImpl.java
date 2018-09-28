package com.example.oasis.serviceImplementations;

import com.example.oasis.exceptions.UserNotFoundException;
import com.example.oasis.models.Employee;
import com.example.oasis.repositories.LoginRepository;
import com.example.oasis.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginRepository loginRepository;

    @Override
    public Employee findLoginCredentials(String username, String password) {
        Employee result = loginRepository.findByUsername(username);
        if (result == null) throw new UserNotFoundException("User not found!");

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if (!encoder.matches(password, result.getPassword())) throw new UserNotFoundException("Incorrect password!");

        return result;
    }
}
