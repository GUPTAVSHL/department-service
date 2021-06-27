package com.microsvc.services;

import com.microsvc.entity.Department;
import com.microsvc.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Slf4j
@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;



    public Department saveDepartment(Department department){
        log.info("Inside the DepartmentService:: saveDepartment()::");
        return (departmentRepository.saveAndFlush(department));
    }

    public Department findDepartmentById(Long Id){
        log.info("Inside the DepartmentService:: findDepartmentById()::");
        Department dept = departmentRepository.findById(Id).get();
        return dept;
    }


}
