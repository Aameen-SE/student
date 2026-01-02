package practice2026.ifelse;

public class GreatestAmongThree {

    public static void main(String[] args) {

        //Greatest Among Three
        int num1 = 32;
        int num2 =178;
        int num3 =96;

        if(num1>num2 && num1>num3)
            System.out.println("Greatest Among three is num1 : "+num1);
        else if (num2 > num1 && num2 > num3) {
            System.out.println("Greatest Among three is num2 : "+num2);
        }
        else
            System.out.println("Greatest Among three is num3 : "+num3);


    }
}
