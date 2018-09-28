package com.example.oasis.repositories;

import com.example.oasis.models.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends MongoRepository<Employee, String> {
    Employee findByUsername(String username);
}
