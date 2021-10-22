package ywl.test_mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import ywl.test_mybatis.entity.Student;
import java.util.List;

@Mapper
public interface StudentMapper {
    public List<Student> findAllStudent();

    List<Student> findStudentByno(int no);
}

