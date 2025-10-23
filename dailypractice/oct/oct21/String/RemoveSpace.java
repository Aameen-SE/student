package dailypractice.oct.oct21.String;

public class RemoveSpace {
    public static void main(String[] args) {

        String str ="  Aameen   Hussain  ";

        String removedSpace = str.replaceAll("\\s+","");
        System.out.println("After removing space :"+removedSpace);
    }
}
