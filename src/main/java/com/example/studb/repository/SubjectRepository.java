package com.example.studb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.studb.model.Subject;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Integer>{

}
