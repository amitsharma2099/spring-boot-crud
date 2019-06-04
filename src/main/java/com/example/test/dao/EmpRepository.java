package com.example.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.test.model.Employee;

public interface EmpRepository extends CrudRepository<Employee, Integer>{

}
