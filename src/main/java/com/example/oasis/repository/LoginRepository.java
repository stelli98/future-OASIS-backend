package com.example.oasis.repository;

import com.example.oasis.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends MongoRepository<Employee, String> {
    Employee findByUsernameAndPassword(String username, String password);
}
