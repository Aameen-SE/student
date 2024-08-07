package corejava.aug06;

public class PerfectNum {
    public static void main(String[] args) {
        int num=27;
        int sum=0;

        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;

            }
        }


        if(sum==num){
            System.out.println("Perfect number as its sum is :"+sum);
        }
        else
            System.out.println("Not perfect number as its sum is "+sum);

    }
}
