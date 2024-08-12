package corejava.aug12;

public class StrngConvertToChar {
    public static void main(String[] args) {
        String str ="This is a string ";
        char ch ;
        System.out.println("Original String :"+str);
        System.out.print("String converted into a char : ");
        for (int i =0;i<str.length();i++){
            ch=str.charAt(i);
            System.out.print(ch);
        }

    }
}
