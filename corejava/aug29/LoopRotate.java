package corejava.aug29;

public class LoopRotate {
    public static void main(String[] args) {
        //wap to give a condition that loop may be rotate
        // upto 10 but break loop when it rotates uptop 7 times.

        int rotate=1;
        int i;
        for( i=1;i<=10;i++,rotate++){

            if(rotate==7)
                break;
        }
        System.out.println("Number of time it rotates : "+rotate);
    }
}
