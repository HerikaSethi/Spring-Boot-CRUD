package com.example.demo.repository;

import com.example.demo.model.EmployeeDao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<EmployeeDao, UUID> {
}
