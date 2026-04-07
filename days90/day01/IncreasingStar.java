package days90.day01;

public class IncreasingStar {
    public static void main(String[] args) {
        int num=5;
        increseStar(num);
    }
    public static void increseStar(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
