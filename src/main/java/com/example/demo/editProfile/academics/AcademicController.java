package com.example.demo.editProfile.academics;

import com.example.demo.editProfile.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/academics")
public class AcademicController {
    private final AcademicService academicService;

    @Autowired
    public AcademicController(AcademicService academicService) {
        this.academicService = academicService;
    }

    @GetMapping("/records")
    public List<Academics> getAcademic(){
        return AcademicService.getAcademics();
    }

    @PostMapping
    public void addAcademics(@RequestBody Academics academics){
        academicService.addAcademics(academics);
    }



}
