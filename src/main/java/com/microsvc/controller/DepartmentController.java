package com.microsvc.controller;

import com.microsvc.entity.Department;
import com.microsvc.services.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/")
    public String sayHello(){
        return " Running Department-Service!!";
    }

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department dept){
        log.info("Inside the DepartmentController:: saveDepartment()::");

        return  departmentService.saveDepartment(dept);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById( @PathVariable("id") Long departmentId){
        log.info("Inside the DepartmentController:: findDepartmentById()::");

        return departmentService.findDepartmentById(departmentId);
    }
}
