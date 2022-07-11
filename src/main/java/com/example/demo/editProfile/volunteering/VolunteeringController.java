package com.example.demo.editProfile.volunteering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student/volunteering")
public class VolunteeringController {

    private final VolunteeringService volunteeringService;

    @Autowired
    public VolunteeringController(VolunteeringService volunteeringService) {
        this.volunteeringService = volunteeringService;
    }


    @GetMapping
    public List<Volunteering> getVolunteering(){
        return volunteeringService.getAllVolunteering();
    }

}
