package corejava.strng;
import java.util.Scanner;
public class StringBufferMethod {
    public static void main(String[] args) {
        // adding of word using string buffer method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        System.out.println("Enter the word to be added ;");
        char addWord=sc.next().charAt(0);
        System.out.println("Enter the position to be added");
        int pos = sc.nextInt();

       String update= addChar(str,addWord,pos);
        System.out.println("Updated String :"+update);

    }
    public static String addChar(String str , char aw , int p){
       StringBuffer stringBuffer= new StringBuffer(str);
       stringBuffer.insert(p,aw);
       return stringBuffer.toString();
    }
}
