package com.zlf.mybatisplusdemo.controller;

import com.zlf.mybatisplusdemo.StudentService;
import com.zlf.mybatisplusdemo.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/findList")
    public List<Student> findList(int pageNum, int pageSize) {
        return studentService.findList(pageNum, pageSize);
    }

    @GetMapping("/detail")
    public Student detail(long id) {
        return studentService.detail(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Student student) {
        studentService.add(student);
    }

}
