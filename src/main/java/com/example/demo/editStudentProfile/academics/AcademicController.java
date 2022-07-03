package com.example.demo.editStudentProfile.academics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/academics")
public class AcademicController {
    private final AcademicService academicService;

    @Autowired
    public AcademicController(AcademicService academicService) {
        this.academicService = academicService;
    }

    @GetMapping
    public List<Academics> getAcademic(){
        return AcademicService.getAcademics();
    }

}
