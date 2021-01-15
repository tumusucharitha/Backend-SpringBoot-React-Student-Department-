package com.example.studb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.studb.model.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {

}
