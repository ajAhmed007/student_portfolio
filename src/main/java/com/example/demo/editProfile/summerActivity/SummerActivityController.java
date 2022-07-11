package com.example.demo.editProfile.summerActivity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student/summerActivity")
public class SummerActivityController {

    private final SummerActivityService summerActivityService;
    @Autowired
    public SummerActivityController(SummerActivityService summerActivityService) {
        this.summerActivityService = summerActivityService;
    }

    @GetMapping
    public String summerActivity(){
        return SummerActivityService.getSummerActivity();
    }
}
