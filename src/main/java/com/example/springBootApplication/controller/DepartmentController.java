package com.example.springBootApplication.controller;

import com.example.springBootApplication.entity.Department;
import com.example.springBootApplication.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/Department")
    public Department save(@RequestBody Department department)
    {
      return departmentService.save(department);
    }
}
