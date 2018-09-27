package com.example.oasis.services;

import com.example.oasis.models.Employee;

public interface LoginService {
    Employee findLoginCredentials(String username, String password);
}
