package jva.Exception;

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you password ");
        String pass = scanner.nextLine();

        try{
            validatePass(pass);
        }catch (Exception e){
            System.out.println("Error : "+e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void validatePass(String pass) throws Exception{
        if(pass.length()<8){
            throw new Exception("Password  must be a length of 8");
        }else
            System.out.println("Password is validate ");
    }
}
