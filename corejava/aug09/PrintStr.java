package corejava.aug09;

public class PrintStr {
    public static void main(String[] args) {
        String str = "This is a text";
    String str1="   Yahoo    ";
        System.out.println(str.indexOf("text"));
        System.out.println(str.lastIndexOf("t"));
        System.out.println(str.contains("a"));
        System.out.println(str.startsWith("Not"));
        System.out.println(str.isEmpty());
        System.out.println(str1.equals("Yahoo"));
        System.out.println(str1.equalsIgnoreCase("yahoo"));
        System.out.println(str1.concat(" Hurray"));
        System.out.println(str1.trim());
        //toUpperCase , toLowerCase , Concatenation , Immutable , join (character then the list ), replace
        // StringBuffer which we can use to create string is mutable
    }
}
