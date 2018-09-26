package com.example.oasis.service;

import com.example.oasis.model.Employee;

public interface LoginService {
    Employee findLoginCredentials(String username, String password);
}
