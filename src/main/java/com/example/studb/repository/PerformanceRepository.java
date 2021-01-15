package com.example.studb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.studb.model.Performance;

@Repository
public interface PerformanceRepository extends CrudRepository<Performance, Integer>{

}
