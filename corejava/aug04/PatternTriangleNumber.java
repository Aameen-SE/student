package corejava.aug04;

public class PatternTriangleNumber {
    public static void main(String[] args) {
        int num=4;

        for(int i =1;i<=num; i++)
        {
            for(int space=1;space<=num-i;space++)
            {
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
