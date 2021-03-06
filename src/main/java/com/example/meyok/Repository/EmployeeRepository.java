package com.example.meyok.Repository;

import com.example.meyok.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String> {
    Optional<Employee> findEmployeeById(String employeeId);
}
