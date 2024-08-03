package corejava.datatype;

public class PrintCharVar {
    public static void main(String[] args) {
        //Wap to create and print a char variable 15 times with 26 different char values.
        char c='1';
        for(int i=1;i<=15;i++)
        {
            c+=26;
            System.out.println("i : "+i+" , c :"+c);
        }
    }
}
