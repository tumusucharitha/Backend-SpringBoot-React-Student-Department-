package com.example.studb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.studb.model.Lecturer;

@Repository
public interface LecturerRepository extends CrudRepository<Lecturer, Integer>{

}
