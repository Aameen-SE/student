package dailypractice.nov.nov20;
//Check if two strings are rotations of each other
public class CheckTwoStringRotation {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str2= "efff";

       boolean result = checkRotation(str1,str2);

       if(result)
           System.out.println("Both string are rotation of each other");
       else
           System.out.println("Both string are not rotation of each other");
    }


    public static boolean checkRotation(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        String combined =str1+str1;
        return combined.contains(str2);
    }
}
