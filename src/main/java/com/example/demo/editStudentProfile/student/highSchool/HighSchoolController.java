package com.example.demo.editStudentProfile.student.highSchool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student/highschool")
public class HighSchoolController {
    private final HighSchoolService highSchoolService;
    @Autowired
    public HighSchoolController(HighSchoolService highSchoolService) {
        this.highSchoolService = highSchoolService;
    }
    @GetMapping
    public List<HighSchool> getHighSchoolStudents(){
        return highSchoolService.getHighSchoolStudents();
    }
}
