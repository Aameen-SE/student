package jva.may06;

public class ExceptionProg1 {
    public static void main(String[] args) {
        // use of try and catch exception
       try {
           int a =10;
           int b=0;
           int c=a/b;
       } catch (Exception e){
           System.out.println(e);
       }



    }
}
