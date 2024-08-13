package corejava.aug12;

public class Airthmethic {

    //create a class of name Arithmetic, add methods like add, sub, div, prod.


    private int num1;
    private int num2;

    public Airthmethic(int num1 , int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public int getAdd(){
        int add=num1+num2;
        return add;
    }

    public int getSub(){
        int sub=num1-num2;
        return sub;
    }

    public int getProd(){
        int prod=num1*num2;
        return prod;
    }

    public int getDiv(){
        int div=num1/num2;
        return div;
    }

}
