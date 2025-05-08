package jva.may07;

class YoungerException extends Exception{
    YoungerException(){
        System.out.println("You are under Age ");
    }
}
// as we are making custom checked exzception we have to use throws in the main method
public class TestExceptn {
    public static void main(String[] args) throws Exception{
        int age=16;

        YoungerException youngerException =new YoungerException();
        if (age<=18){
            throw new YoungerException();
        }
        else
            System.out.println("Eligible for voting");
    }
}
