package javacore.arry;

public class NegativeinArr {
    public static void main(String[] args) {
        //wap to print only negative number from an array
        int[] arr = {-1,42,-98,76,-54,60};

        System.out.println("Printing the negative num in array : ");
        for(int a :arr){
            if(a<0){
                System.out.print(a+" , ");
            }
        }


    }
}
