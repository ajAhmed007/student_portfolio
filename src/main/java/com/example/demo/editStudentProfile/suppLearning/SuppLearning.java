package com.example.demo.editStudentProfile.suppLearning;

import com.example.demo.editStudentProfile.profileData.ProfileData;

public class SuppLearning extends ProfileData {
    private String programName;
    private String organization;
    private String awards_achievements;

    /***
     * @param gradeLevel student's current education level
     * @param state state where education took place
     * @param city city where education tool place
     * @param startDate when student started going there
     * @param endDate graduation date
     * @param gpa grade recieved
     */
    public SuppLearning(String gradeLevel,
                        String state,
                        String city,
                        String startDate,
                        String endDate,
                        double gpa,
                        String programName,
                        String organization,
                        String awards_achievements) {
        super(gradeLevel, state, city, startDate, endDate, endDate, gpa);
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

    @Override
    public String summary() {
        return "Sharing learning experience " +
                "i've had outside of school";
    }
}
