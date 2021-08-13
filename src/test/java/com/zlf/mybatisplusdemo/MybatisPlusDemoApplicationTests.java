package com.zlf.mybatisplusdemo;

import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSONUtil;
import com.zlf.mybatisplusdemo.domain.Student;
import com.zlf.mybatisplusdemo.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.List;

@SpringBootTest
class MybatisPlusDemoApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private DataSource dataSource;

    @Test
    void testInsert() {
        Student student = new Student();
        student.setName("张杰");
        student.setBirthday(DateUtil.parse("1995-12-14 00:00:00"));
        student.setIsDelete(false);
        studentMapper.insert(student);
    }

    @Test
    void testSelectOne() {
        Student student = studentMapper.selectById(8);
        System.out.println(JSONUtil.toJsonPrettyStr(student));
    }


    @Test
    void testSelectList() {
        List<Student> studentList = studentMapper.selectList(null);
        System.out.println(JSONUtil.toJsonPrettyStr(studentList));
    }

    @Test
    void testDeleteOne() {
        studentMapper.deleteById(8);
    }

}
