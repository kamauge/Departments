package com.regera.departments.service;

import com.regera.departments.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepartmentService {

     Department saveDepartment(Department department);

     List<Department> getDocuments();

     Department fetchDepartmentId(Long departmentId);

     Department fetchDepartmentId(String departmentName);

     void deleteDepartmentId(String department);

     Department updateDepartment(Long departmentId,Department department);
}
