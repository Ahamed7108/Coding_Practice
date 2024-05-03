package com.example.springBootApplication.service;

import com.example.springBootApplication.entity.Department;
import com.example.springBootApplication.repository.RepositoryLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImp implements DepartmentService{
    @Autowired
    private RepositoryLayer repositoryLayer;
    @Override
    public Department save(Department department) {
        return repositoryLayer.save(department);
    }
}
