package com.example.demo.editProfile.suppLearning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/SuppLearning")
public class SuppLearningController {
    private final SuppLearningService suppLearningService;

    @Autowired
    public SuppLearningController(SuppLearningService suppLearningService) {
        this.suppLearningService = suppLearningService;

    }

    @GetMapping
    public List<SuppLearning> getSuppLearning(){
        return SuppLearningService.getSuppLearning();
    }
}
