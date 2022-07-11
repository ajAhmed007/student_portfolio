package com.example.demo.editProfile.volunteering;

import com.example.demo.editProfile.profileData.ProfileData;

import java.time.LocalDate;

public class Volunteering extends ProfileData {
    String organization;
    int hours;
    String description;

    public Volunteering(String gradeLevel,
                        String state,
                        String city,
                        LocalDate startDate,
                        LocalDate endDate,
                        String organization,
                        int hours,
                        String description) {
        super(gradeLevel, state, city, startDate, endDate);
        this.organization = organization;
        this.hours = hours;
        this.description = description;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Volunteering{" +
                "organization='" + organization + '\'' +
                ", hours=" + hours +
                ", description='" + description + '\'' +
                '}';
    }
}
