package com.example.demo.editProfile.summerActivity;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class SummerActivityService {
    @GetMapping
    public static String getSummerActivity() {
        return "Learned web development over this past summer";
    }
}
