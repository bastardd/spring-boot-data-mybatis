package com.tzl.controller;

import com.tzl.bean.Department;
import com.tzl.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dept")
public class DepartmentController {

    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/getById/{id}")
    public Department getDeptById(@PathVariable(value = "id") Integer id){
        Department department = departmentMapper.getDeptById(id);
        System.out.println(department.toString());
        return department;      //{"id":1,"name":"张三"}
    }

    @PostMapping("/addDept")
    public Department addDept(Department department){
       departmentMapper.insertDept(department);
        System.out.println(department.toString());
        return department;      //{"id":1,"name":"张三"}
    }

}
