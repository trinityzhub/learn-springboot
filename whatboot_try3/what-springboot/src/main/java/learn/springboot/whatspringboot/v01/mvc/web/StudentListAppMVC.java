package learn.springboot.whatspringboot.v01.mvc.web;

//import com.google.gson.Gson;
import learn.springboot.whatspringboot.v01.mvc.entity.Student;
import learn.springboot.whatspringboot.v01.mvc.service.StudentController;

import java.util.List;

public class StudentListAppMVC {

    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        List<Student> students = studentController.getAllStudents();


        /*
        // Convert students to JSON using Gson
        Gson gson = new Gson();
        String studentsJson = gson.toJson(students);

        System.out.println(studentsJson);
        */
        System.out.println(students.get(1).toString());
        System.out.println(students.get(2).toString());

    }
}
