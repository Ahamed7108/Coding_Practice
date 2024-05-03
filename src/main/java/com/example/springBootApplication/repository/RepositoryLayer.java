package com.example.springBootApplication.repository;

import com.example.springBootApplication.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryLayer extends JpaRepository<Department,Long> {
}
