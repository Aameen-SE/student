package corejava.aug12;

public class ReverseStrng {
    public static void main(String[] args) {
        String str ="This is a String";
        System.out.println("Original String :"+str);
        String rev="";
        char ch ;

        for(int i =0;i<str.length();i++)
        {
            ch=str.charAt(i);
            rev=ch+rev;
        }
        System.out.println("Reverse of a given String : "+rev);
    }
}
