package com.example.demo.editStudentProfile.academics;
import com.example.demo.editStudentProfile.profileData.ProfileData;

public  class Academics extends ProfileData {

    public Academics(String gradeLevel, String state, String city,
                     String schoolName, String startDate,
                     String endDate, double gpa) {
        super(gradeLevel, state, city, schoolName, startDate, endDate, (int) gpa);
    }

    public Academics() {

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
