package com.example.demo.editStudentProfile.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    //a reference to StudentService
    private final StudentService studentService;

    @Autowired //automatically instantiates the StudentService
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

//    @RequestMapping(method = RequestMethod.POST, path = "api/v1/student")
//    public void addStudent(@RequestBody Student student){
//        StudentService.getStudents();
//    }
}
