package jva.may09;
//use throw to create new exception , custom or user defined exception
import java.util.Scanner;

class YoungerAgeException extends RuntimeException{
    YoungerAgeException(String msg){
        super(msg);
    }
}
public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age =sc.nextInt();
            try{ if(age<=18){
                throw new YoungerAgeException("You are not eligible ");
          //      System.out.println("Helllo");          it will not work after throw 
            }else {
                System.out.println("You are eligible ");
            }
            }catch(Exception e){e.printStackTrace();}

        System.out.println("Hello");
    }
}
