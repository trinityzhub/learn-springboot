package learn.springboot.whatspringboot.v13.web;

import learn.springboot.whatspringboot.v12.service.Coach;
import learn.springboot.whatspringboot.v13.dao.StudentDAO;
import learn.springboot.whatspringboot.v13.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import  java.util.*;


@RestController
public class StudentsController {

    private final StudentDAO theStudentDAO;

    @Autowired
    public StudentsController(StudentDAO theStudentDAO) {
        this.theStudentDAO=theStudentDAO;
    }

    @GetMapping("/all")
    public List<Student> getDailyWorkout() {
        return  null; //theStudentDAO.();
    }


}
