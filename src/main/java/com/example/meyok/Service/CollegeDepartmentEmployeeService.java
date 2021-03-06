package com.example.meyok.Service;

import com.example.meyok.Model.CollegeDepartmentEmployee;

import java.util.List;

public interface CollegeDepartmentEmployeeService {
    void insert(CollegeDepartmentEmployee collegeDepartmentEmployee);
    List<CollegeDepartmentEmployee> getAllCollegeDepartmentEmployeeEmployee();
    void deleteById(String collegeDepartmentEmployeeId);
    void update(String collegeDepartmentEmployeeId,CollegeDepartmentEmployee collegeDepartmentEmployee);
    CollegeDepartmentEmployee getCollegeDepartmentEmployeeId(String collegeDepartmentEmployeeId);
}
