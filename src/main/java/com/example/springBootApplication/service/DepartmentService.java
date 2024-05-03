package com.example.springBootApplication.service;

import com.example.springBootApplication.entity.Department;
import org.springframework.stereotype.Service;


public interface DepartmentService {
  public Department save(Department department);
}
