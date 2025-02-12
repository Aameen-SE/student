package javacore.forloop;

public class Program15 {
    public static void main(String[] args) {
        //wap to print all upper case alphabets except vowels.
        System.out.println("Print all upper case alphabets except vowels.");

        for(char c = 'A';c<='Z';c++){
            if(c!='A'&&c!='E'&&c!='I'&&c!='O'&&c!='U'){
                System.out.print(c+" , ");
            }

        }
    }
}
