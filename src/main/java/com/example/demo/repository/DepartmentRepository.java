package com.example.demo.repository;

import com.example.demo.models.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository <Department, Long> {
}
