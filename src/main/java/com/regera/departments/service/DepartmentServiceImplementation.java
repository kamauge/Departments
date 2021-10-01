package com.regera.departments.service;

import com.regera.departments.entity.Department;
import com.regera.departments.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImplementation implements DepartmentService{
    @Autowired
    DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getDocuments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentId(Long departmentId) {
        return null;
    }

    @Override
    public Department fetchDepartmentId(String departmentName) {
        return null;
    }

    @Override
    public void deleteDepartmentId(String department) {

    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        return null;
    }
}
