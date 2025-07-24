package training;

public class TernaryOperator {
    
    public static void main(String[] args) {

        // (condition) ? expression1 : (expression2)? expre1 : exp-re2

        int num = 32;
        String str = (num%2==0)?"isEven":"Not Even";
        //                              32<33? "B = 32","33"
        String rsult = num>33?  "A" : num<33 ? "B" : "C";


        System.out.println("Number is : "+rsult);
    }
}
