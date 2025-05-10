package jva.may10;

import java.time.LocalDate;

public class UserMain {
    public static void main(String[] args) {
        User user = new User();

        user.setId(123);
        user.setCountryCode(91);
        user.setFullName("Aameen Hussain ");
        user.setEmail("aameen@gmail.com");

        user.setGender("Male");

        System.out.println("Name : "+user.getFullName()+" ;  CountryCode : "+user.getCountryCode()
        +" Id : "+user.getId()+" ; Email : "+user.getEmail()+" ; Gender : "+user.getGender());
    }
}
