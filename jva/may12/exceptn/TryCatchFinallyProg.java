package jva.may12.exceptn;
class Test1 {
    public  void divideNum(int a, int b){
        int c= a/b;
            System.out.println(c);


    }
}
public class TryCatchFinallyProg {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        try{
            test1.divideNum(100,0);
        }catch(Exception e){

        }

        try{
            System.out.println(100/0);
        }catch(Exception e ){
            e.printStackTrace();
        }finally {
            System.out.println("It will be printed no matter what : ");
        }
    }
}
