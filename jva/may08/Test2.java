package jva.may08;
class Addit {
     void addNum(int n1,int n2){
         System.out.println(n1+n2);
     }
}
public class Test2  extends Addit{
    public static void main(String[] args) {
        int n1=10,n2=98;
        Test2 t2 = new Test2();
        t2.addNum(n1,n2);
    }
    public  void addNum(int n1, int n2){
        System.out.println(n1+n2);
    }
}
