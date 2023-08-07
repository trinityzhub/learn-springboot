package learn.springboot.whatspringboot.v01.mvc.service;

import learn.springboot.whatspringboot.v01.mvc.dao.StudentDAO;
import learn.springboot.whatspringboot.v01.mvc.entity.Student;

import java.util.List;

public class StudentController {
    private StudentDAO studentDAO = new StudentDAO();

    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }
}
