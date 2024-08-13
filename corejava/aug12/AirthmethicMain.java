package corejava.aug12;

public class AirthmethicMain {
    public static void main(String[] args) {
        //create a class of name Arithmetic, add methods like add, sub, div, prod.
        int num1=12,num2=3;
        Airthmethic airthmethic = new Airthmethic(num1,num2);

        System.out.println("Addition of two num : "+airthmethic.getAdd());
        System.out.println("Subtraction of two num :"+airthmethic.getSub());
        System.out.println("Product of two num :"+airthmethic.getProd());
        System.out.println("Divide of two num :"+airthmethic.getDiv());




    }
}
