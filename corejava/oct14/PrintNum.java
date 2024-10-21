package corejava.oct14;

public class PrintNum {
    public static void main(String[] args) {
        //wap to print all numbers between 30 to 80 those are divisible by 6 and 5.
        printNum();
        printNum1();
    }
    public static void printNum(){
        System.out.println("Printing using for loop :");
        for(int i=30;i<=80;i++){
            if(i%6==0&&i%5==0){
                System.out.println(i+";");
            }
        }
    }

    public static void printNum1(){
        System.out.println("Printing using while loop :");
       int num=30;
        while(num<=80){
            if(num%6==0&&num%5==0){
                System.out.println(num+";");
            }
            num++;
        }
    }
}
