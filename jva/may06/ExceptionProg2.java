package jva.may06;

public class ExceptionProg2 {
    public static void main(String[] args) {
        try{
            int a=10,b=0;
            int c=a/b;
        }catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println("will still be executed even if there is exception");
        }
    }
}
