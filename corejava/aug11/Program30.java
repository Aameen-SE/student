package corejava.aug11;

public class Program30 {
    public static void main(String[] args) {
        //How to reverse a String?
        String str ="This is a string ";
        String rev="";
        char ch;
        System.out.println("Original String : "+str);
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            rev=ch+rev;
        }
        System.out.println("String after reverse :"+rev);
    }
}
