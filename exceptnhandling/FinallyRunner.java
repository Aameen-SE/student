package exceptnhandling;

import java.util.Scanner;

public class FinallyRunner {
    public static void main(String[] args) {
        Scanner sc = null ;

        try{
            sc = new Scanner(System.in);
            int[] num ={12,24,52};
            int nums = num[5];
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {

            System.out.println("Before scanner close ");
            if(sc!=null)
            sc.close();
        }

        System.out.println("Print before main method ");
    }
}
