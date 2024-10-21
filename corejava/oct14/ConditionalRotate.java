package corejava.oct14;

public class ConditionalRotate {
    public static void main(String[] args) {
        //wap to give a condition that loop may be rotate upto 10 but
        // break loop when it rotates uptop 7 times.

        for(int i =1;i<=10;i++){
            System.out.print(i+" ; ");
            if(i==7){
                System.out.println("Rotation upto  : "+i);
                break;

            }
        }

    }
}
