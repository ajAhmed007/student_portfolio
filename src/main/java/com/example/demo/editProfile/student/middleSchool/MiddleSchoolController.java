package com.example.demo.editProfile.student.middleSchool;

import com.example.demo.editProfile.student.highSchool.HighSchool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student/middleschool")
public class MiddleSchoolController {
    private final MiddleSchoolService middleSchoolService;
    @Autowired
    public MiddleSchoolController(MiddleSchoolService middleSchoolService) {
        this.middleSchoolService = middleSchoolService;
    }
    @GetMapping
    public List<MiddleSchool> getMiddleSchoolStudents(){
        return middleSchoolService.getMiddleSchoolStudents();
    }

    @GetMapping("/honors_clubs")
    public List<MiddleSchool> getMS_Honors_Clubs(){
        return middleSchoolService.getMS_Honors_Clubs();
    }
}
