package com.zlf.mybatisplusdemo;

import com.github.pagehelper.PageHelper;
import com.zlf.mybatisplusdemo.domain.Student;
import com.zlf.mybatisplusdemo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> findList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return studentMapper.selectList(null);
    }

    public Student detail(long id) {
        return studentMapper.selectById(id);
    }

}
