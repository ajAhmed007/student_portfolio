package com.example.demo.editProfile.student;
import com.example.demo.editProfile.EditProfile;
import com.example.demo.editProfile.address.Address;

import java.time.LocalDate;
import java.util.List;

public class Student implements EditProfile{
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Student() {
    }

    public Student(Long id,
                   String firstName,
                   String lastName,
                   String email,
                   LocalDate dob,
                   Integer age){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
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
