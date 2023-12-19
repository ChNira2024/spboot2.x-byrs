package com.eidiko.niranjana.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eidiko.niranjana.entity.Employee;
@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

}
