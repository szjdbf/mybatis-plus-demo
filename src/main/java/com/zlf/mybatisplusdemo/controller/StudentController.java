package com.zlf.mybatisplusdemo.controller;

import com.zlf.mybatisplusdemo.StudentService;
import com.zlf.mybatisplusdemo.domain.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@Api(tags = "学生API")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/findList")
    @ApiOperation(value = "查询学生列表")
    public List<Student> findList(int pageNum, int pageSize) {
        return studentService.findList(pageNum, pageSize);
    }

    @GetMapping("/detail")
    @ApiOperation(value = "查询学生详情")
    public Student detail(long id) {
        return studentService.detail(id);
    }

    @PostMapping("/add")
    @ApiOperation(value = "新增学生")
    public void add(@RequestBody Student student) {
        studentService.add(student);
    }

}
