package com.example.demo.editProfile.student;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/addStudent")
    public void addNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }



}
