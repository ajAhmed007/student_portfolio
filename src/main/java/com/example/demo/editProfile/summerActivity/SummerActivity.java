package com.example.demo.editProfile.summerActivity;

import com.example.demo.editProfile.EditProfile;
import com.example.demo.editProfile.student.Student;

import java.time.LocalDate;
import java.util.List;

public class SummerActivity extends Student{
    private String programName;
    private String organization;

    private String activity;

    public SummerActivity(Long id,
                          String firstName,
                          String lastName,
                          String email,
                          LocalDate dob,
                          Integer age,
                          String programName,
                          String organization,
                          String activity) {
        super(id, firstName, lastName, email, dob, age);
        this.programName = programName;
        this.organization = organization;
        this.activity = activity;
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

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "SummerActivity{" +
                "programName='" + programName + '\'' +
                ", organization='" + organization + '\'' +
                ", activity='" + activity + '\'' +
                '}';
    }

    /***
     * A summary of the particular
     * activity/education
     * @return summary
     */
    @Override
    public String summary() {
        return null;
    }

    /***
     * Can add clubs the student was
     * involved in.
     * @return a list of clubs
     */
    @Override
    public List<String> clubs() {
        return null;
    }

    /***
     * The student can add any links
     * relevant to their education and
     * experience
     * @return a list of external links
     */
    @Override
    public List<String> externalLinks() {
        return null;
    }
}
