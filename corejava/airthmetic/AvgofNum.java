package corejava.airthmetic;

public class AvgofNum {
    public static void main(String[] args) {
    int x=23,y=54,z=8,w=4;
    avgTwo(x,y);
    avgThree(x,y,z);
        avgFour(x,y,z,w);

    }

    public static void avgTwo(int a,int b){
        //wap to find average of 2 numbers?
        int avg=(a+b)/2;
        System.out.println("avg of two num : "+avg);
    }

    public static void avgThree(int a,int b,int c){
        //wap to find average of 3 numbers?
        int avg=(a+b+c)/3;
        System.out.println("avg of three num : "+avg);
    }
    public static void avgFour(int a,int b,int c,int d){
        //wap to find average of 4 numbers?
        int avg=(a+b+c+d)/4;
        System.out.println("avg of four num : "+avg);
    }

}
