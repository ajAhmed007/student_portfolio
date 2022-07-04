package com.example.demo.editStudentProfile.sports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/sports")
public class SportsController {

    private final SportService sportService;

    @Autowired
    public SportsController(SportService sportService){
        this.sportService = sportService;
    }

    @GetMapping
    public List<Sports> getSports(){
        return sportService.getSports();
    }

}
