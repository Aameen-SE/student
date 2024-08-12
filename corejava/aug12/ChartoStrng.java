package corejava.aug12;

public class ChartoStrng {
    public static void main(String[] args) {
        char[] ch ={'t', 'h','i','s',' ','i','s',' ','a',' ','s','t','r','i','n','g' };
       char[] ch1=ch;

       String str=new String (ch1);
        System.out.println(str);
    }
}
