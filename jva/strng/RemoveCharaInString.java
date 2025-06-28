package jva.strng;

public class RemoveCharaInString {
    public static void main(String[] args) {
        String name ="Aameen";
        String charRemove = "A";
        String result = name.replace(String.valueOf(charRemove),"");
        String result2 = name.replace("A","");
        System.out.println("Original : "+name);
        System.out.println("after removing A : "+result);
        System.out.println("after removing A : "+result2);
    }
}
