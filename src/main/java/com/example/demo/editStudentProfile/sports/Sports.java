package com.example.demo.editStudentProfile.sports;

import com.example.demo.editStudentProfile.profileData.ProfileData;

import java.time.LocalDate;
import java.util.List;

public class Sports extends ProfileData {
    private String schoolName;
    private String sportsProgram;
    private String teamName;
    private String sportType;





    public Sports(String gradeLevel,
                  String state,
                  String city,
                  LocalDate startDate,
                  LocalDate endDate,
                  double gpa,
                  String schoolName,
                  String sportsProgram,
                  String teamName,
                  String sportType) {
        super(gradeLevel, state, city, startDate, endDate, gpa);
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
}
