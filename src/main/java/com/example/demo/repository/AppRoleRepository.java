package com.example.demo.repository;

import com.example.demo.models.AppRole;
import org.springframework.data.repository.CrudRepository;

public interface AppRoleRepository extends CrudRepository<AppRole,Long> {
    AppRole findByRoleName(String role);
}
