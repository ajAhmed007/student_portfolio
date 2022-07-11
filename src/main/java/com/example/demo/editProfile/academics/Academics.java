package com.example.demo.editProfile.academics;
import com.example.demo.editProfile.profileData.ProfileData;

import java.time.LocalDate;

public  class Academics extends ProfileData {
    private String schoolName;

    public Academics(String gradeLevel,
                     String state,
                     String city,
                     String schoolName,
                     LocalDate startDate,
                     LocalDate endDate,
                     double gpa) {
        super(gradeLevel, state, city, startDate, endDate, gpa);
        this.schoolName = schoolName;
    }

    public Academics() {

    }

    @Override
    public String toString() {
        return "Academics{" +
                "schoolName='" + schoolName + '\'' +
                '}';
    }

    @Override
    public String summary() {
        return "Here's my academic history";
    }

    @Override
    public String clubs() {
        return "Sharing information " +
                "about the clubs I was part of " +
                "in school";
    }

    @Override
    public String externalLinks() {
        return "www.example.com";
    }
}
