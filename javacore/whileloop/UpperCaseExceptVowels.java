package javacore.whileloop;

public class UpperCaseExceptVowels {
    public static void main(String[] args) {
        //wap to print all upper case alphabets except vowels.
        char c='A';

        while(c<='Z'){
            if(c!='A'&&c!='E'&&c!='I'&&c!='O'&&c!='U'){
                System.out.print(c+" ");

            }
            c++;
        }
    }
}
