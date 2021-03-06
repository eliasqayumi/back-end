package com.example.meyok.Repository;

import com.example.meyok.Model.CollegeDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CollegeDepartmentRepository extends JpaRepository<CollegeDepartment,String> {
    Optional<CollegeDepartment> findCollegeDepartmentById(String collegeDepartmentId);
}
