package typecasting.implicit;

public class Prog2 {
    public static void main(String[] args) {
        //Assign a char to an int variable.
        char c = 'A';
        System.out.println("Char value of variable : "+c);
        int var = c;
        System.out.println("Integer value of char variable after assigning it to int : "+var);
    }
}
