package jva.may09;

public class ThrowsProg1 {
    public static void main(String[] args) throws Exception{
      try{  System.out.println(100/0);
    } catch(Exception e){
          e.printStackTrace();
      }
        System.out.println("hello"); // statement is printed when the exception is handle or else it will be abnormally terminated
    }
}
