package jva.may10;
// Encapsulation

//Create a class Users having member variables id, fullName, email, gender, dateOfBirth, countryCode,
// create getters and setters
//		for all member variables.
//		Create object of Users class in other class
//		inside main method and set all member values and print all member
//		values using getters.

import java.time.LocalDate;

public class User {

    private int id;
    private String fullName;
    private String email;
    private String gender;
    private int countryCode;



    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }




}
