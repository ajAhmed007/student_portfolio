package com.example.demo.editProfile.suppLearning;


import com.example.demo.editProfile.EditProfile;
import com.example.demo.editProfile.student.Student;

import java.time.LocalDate;

public class SuppLearning extends Student{
    private String programName;
    private String organization;
    private String awards_achievements;


    public SuppLearning(Long id,
                        String firstName,
                        String lastName,
                        String email,
                        LocalDate dob,
                        Integer age,
                        String programName,
                        String organization,
                        String awards_achievements) {
        super(id, firstName, lastName, email, dob, age);
        this.programName = programName;
        this.organization = organization;
        this.awards_achievements = awards_achievements;
    }



    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getAwards_achievements() {
        return awards_achievements;
    }

    public void setAwards_achievements(String awards_achievements) {
        this.awards_achievements = awards_achievements;
    }

    @Override
    public String toString() {
        return "suppLearning{" +
                "programName='" + programName + '\'' +
                ", organization='" + organization + '\'' +
                ", awards_achievements='" + awards_achievements + '\'' +
                '}';
    }

}
