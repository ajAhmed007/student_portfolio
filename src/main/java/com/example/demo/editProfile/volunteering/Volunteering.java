package com.example.demo.editProfile.volunteering;
import com.example.demo.editProfile.EditProfile;
import com.example.demo.editProfile.student.Student;

import java.time.LocalDate;

public class Volunteering extends Student{
    private String programName;
    private String organization;
    private Integer hours;

    public Volunteering(Long id,
                        String firstName,
                        String lastName,
                        String email,
                        LocalDate dob,
                        Integer age,
                        String programName,
                        String organization,
                        Integer hours) {
        super(id, firstName, lastName, email, dob, age);
        this.programName = programName;
        this.organization = organization;
        this.hours = hours;
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

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Volunteering{" +
                "programName='" + programName + '\'' +
                ", organization='" + organization + '\'' +
                ", hours=" + hours +
                '}';
    }
}
