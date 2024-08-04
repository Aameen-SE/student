package corejava.aug03;

public class DivisibleRangeofNum {
    public static void main(String[] args) {

        divisibleByThree();
        divisibleByTen();
    }
    public static void divisibleByThree()
    {
        for(int i=1;i<=10;i++)
        {
            if(i%3==0)
                System.out.println("i :"+i);
        }
    }

    public static void divisibleByTen()
    {
        for(int i=1;i<=100;i++)
        {
            if(i%10==0)
                System.out.println("i :"+i);
        }
    }


}
