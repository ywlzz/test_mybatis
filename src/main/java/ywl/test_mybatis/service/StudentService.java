package ywl.test_mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ywl.test_mybatis.entity.Student;
import ywl.test_mybatis.mapper.StudentMapper;

import java.util.List;

@Service
public class StudentService {
    @Autowired(required = false)
    public StudentMapper studentMapper;
    public List<Student> findAllStudent() {
        return studentMapper.findAllStudent();
    }

    public List<Student> findStudentByno(int no) {
        return studentMapper.findStudentByno(no);
    }
}
