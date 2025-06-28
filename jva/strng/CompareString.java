package jva.strng;

public class CompareString {
    public static void main(String[] args) {
        String name ="Aameen";
        String name1 = new String("Aameen");

        if(name1==name)
            System.out.println("isSame");
        else
            System.out.println("notSame");

        if(name1.equals(name))
            System.out.println("IsSame using equal function");
        else
            System.out.println("IsNot same using equal function");
    }
}
