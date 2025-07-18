package dailypractice.july18;

public class RemoveStringFromInteger {

    public static void main(String[] args) {

        String str = "Hey There it is 2025, People";
        str=str.replaceAll("[0-9]","");
        System.out.println(str);
    }
}
