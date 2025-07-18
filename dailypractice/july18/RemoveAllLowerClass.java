package dailypractice.july18;

//Wap to remove all lower case letters, String s = "aAzZXYcFEDgHIjklMNppc";
public class RemoveAllLowerClass {

    public static void main(String[] args) {

        String s = "aAzZXYcFEDgHIjklMNppc";
        s=s.replaceAll("[a-z]","");

        System.out.println(s);
    }
}
