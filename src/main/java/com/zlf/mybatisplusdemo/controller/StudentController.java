package com.zlf.mybatisplusdemo.controller;

import com.zlf.mybatisplusdemo.domain.Student;
import com.zlf.mybatisplusdemo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/findAll")
    public List<Student> findAll() {
        return studentMapper.selectList(null);
    }

    @GetMapping("/detail")
    public Student detail(Long id) {
        return studentMapper.selectById(id);
    }

}
