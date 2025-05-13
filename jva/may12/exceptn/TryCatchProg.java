package jva.may12.exceptn;

public class TryCatchProg {
    public static void main(String[] args) {
        try{
            System.out.println(100/0);
        }catch(Exception e){
            System.out.println(e);
        }
        // rightnow the code is not abnormally shutting down, its been handle by try catch exception
        System.out.println("HEllO : after handling the exception using try and catch ");
    }
}
