package jva.may07;
class Add{
    void addNum(int n1 , int n2){
        System.out.println("Add method ");
        System.out.println(n1+n2);
    }
}

public class Xyz extends  Add{
    void addNum(int n1, int n2){
        System.out.println("XYz method ");
        System.out.println(n1+n2);
    }

    public static void main(String[] args) {
        int n1=10,n2=98;
        Xyz xyz =new Xyz();
        xyz.addNum(n1,n2);

        Add ad =new Add();
        ad.addNum(n1,n2);
    }
    

    }




