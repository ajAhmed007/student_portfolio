package com.example.demo.editProfile.summerActivity;

import com.example.demo.editProfile.profileData.ProfileData;

import java.time.LocalDate;

public class SummerActivity extends ProfileData {
    private String activity;

    public SummerActivity(String gradeLevel,
                          String state,
                          String city,
                          LocalDate startDate,
                          LocalDate endDate,
                          double gpa,
                          String activity) {
        super(gradeLevel, state, city, startDate, endDate, gpa);
        this.activity = activity;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "SummerActivity{" +
                "activity='" + activity + '\'' +
                '}';
    }
}
