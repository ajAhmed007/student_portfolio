package com.example.demo.editProfile.academics;

import com.example.demo.editProfile.EditProfile;
import com.example.demo.editProfile.student.Student;

import java.time.LocalDate;
import java.util.List;

public  class Academics extends Student{
    private String schoolName;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<String> awards;

    public Academics() {
    }

    public Academics(Long id,
                     String firstName,
                     String lastName,
                     String email,
                     LocalDate dob,
                     Integer age,
                     String schoolName,
                     LocalDate startDate,
                     LocalDate endDate,
                     List<String> awards) {
        super(id, firstName, lastName, email, dob, age);
        this.schoolName = schoolName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.awards = awards;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
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

    public List<String> getAwards() {
        return awards;
    }

    public void setAwards(List<String> awards) {
        this.awards = awards;
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
