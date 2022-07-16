package com.example.demo.editProfile.address;

import com.example.demo.editProfile.student.Student;

public class Address{
    //street address
    private String address;
    private String city;
    private String state;
    private Integer zipcode;

    /***
     * Default constructor. Constructs a new
     * Address object
     */
    public Address() {
    }

    /***
     * Parameterized constructor. Constructs a new
     * Address object, given:
     * @param address street address
     * @param city address city
     * @param state address state
     * @param zipcode address zipcode
     */
    public Address(String address, String city, String state, Integer zipcode) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    /***
     * Retrieves the street address
     * @return  street address
     */
    public String getAddress() {
        return address;
    }

    /***
     * Sets the street address
     * @param address street address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /***
     * Gets the city for the address
     * @return address city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZibcode() {
        return zipcode;
    }

    public void setZibcode(Integer zibcode) {
        this.zipcode = zibcode;
    }
}
