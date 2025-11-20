package dailypractice.nov.nov20;

public class CountWords {
    public static void main(String[] args) {
        String str ="I am a Software Developer";
        String [] strArr = str.split("\\s+");
        System.out.println(strArr.length);
    }
}
