package com.example.demo.editProfile.sports;

import com.example.demo.editProfile.EditProfile;
import com.example.demo.editProfile.student.Student;

import java.time.LocalDate;

public class Sports extends Student{
    private String schoolName;
    private String sportsProgram;
    private String teamName;
    private String sportType;

    public Sports(Long id,
                  String firstName,
                  String lastName,
                  String email,
                  LocalDate dob,
                  Integer age,
                  String schoolName,
                  String sportsProgram,
                  String teamName,
                  String sportType) {
        super(id, firstName, lastName, email, dob, age);
        this.schoolName = schoolName;
        this.sportsProgram = sportsProgram;
        this.teamName = teamName;
        this.sportType = sportType;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSportsProgram() {
        return sportsProgram;
    }

    public void setSportsProgram(String sportsProgram) {
        this.sportsProgram = sportsProgram;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    @Override
    public String toString() {
        return "Sports{" +
                "schoolName='" + schoolName + '\'' +
                ", sportsProgram='" + sportsProgram + '\'' +
                ", teamName='" + teamName + '\'' +
                ", sportType='" + sportType + '\'' +
                '}';
    }
}
