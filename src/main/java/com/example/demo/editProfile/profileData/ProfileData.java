package com.example.demo.editProfile.profileData;

import com.example.demo.editProfile.EditProfile;

import java.time.LocalDate;

public class ProfileData implements EditProfile{
    private String gradeLevel;
    private String state;
    private String city;
    private LocalDate startDate;
    private LocalDate endDate;
    private double gpa;

    /***
     *  @param gradeLevel student's current education level
     * @param state state where education took place
     * @param city city where education tool place
     * @param startDate when student started going there
     * @param endDate graduation date
     * @param date
     * @param gpa grade recieved
     */
    public ProfileData(String gradeLevel, String state,
                       String city,
                       LocalDate startDate, LocalDate endDate,
                       double gpa) {
        this.gradeLevel = gradeLevel;
        this.state = state;
        this.city = city;
        this.startDate = startDate;
        this.endDate = endDate;
        this.gpa = gpa;
    }

    public ProfileData() {
    }

    public ProfileData(String gradeLevel,
                       String state,
                       String city,
                       LocalDate startDate,
                       LocalDate endDate) {
    }


    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "ProfileData{" +
                "gradeLevel='" + gradeLevel + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public String summary() {
        return null;
    }

    @Override
    public String clubs() {
        return null;
    }

    @Override
    public String externalLinks() {
        return null;
    }
}

