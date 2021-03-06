package com.example.demo.editProfile.student.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student/college")
public class CollegeController {

    private final CollegeService collegeService;
    @Autowired
    public CollegeController(CollegeService collegeService) {
        this.collegeService = collegeService;
    }
    @GetMapping
    public List<College> getCollegeStudents(){
        return collegeService.getCollegeStudent();
    }
}
