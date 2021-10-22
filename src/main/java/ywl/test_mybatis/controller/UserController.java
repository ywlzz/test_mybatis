package ywl.test_mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ywl.test_mybatis.entity.Student;
import ywl.test_mybatis.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class UserController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/getAllStudent")
    public List<Student> findAll(){
        return studentService.findAllStudent();
    }

    @RequestMapping("/getStudentByno/{no}")
    public List<Student> findUserByStudentId(@PathVariable int no){
        return studentService.findStudentByno(no);
    }
}
