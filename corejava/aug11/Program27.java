package corejava.aug11;

public class Program27 {
    public static void main(String[] args) {
        //How to search last occurance of a substring inside a substring?
        String str="This is a string ";
        System.out.println("String given : "+str);
        String str2=str.substring(5);
        System.out.println("Substring of string : "+str2);
        String lastOccur = str2.substring(10);
        System.out.println("Last occurence of a substring inside a substring : "+lastOccur);
    }
}
