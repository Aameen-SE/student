package jva.may12.thread;
class myTest1Threadd extends Thread{
    @Override
    public void run() {
        System.out.println("Task 1 ");
    }
}

class myTest2Thread extends Thread{
    @Override
    public void run() {
        System.out.println("Task 2");
    }

}

class myTest3Thread extends Thread{
    @Override
    public void run() {
        System.out.println("Task 3");
    }
}
public class Case3Thread {
    public static void main(String[] args) {
        myTest1Threadd myt1 = new myTest1Threadd();
        myt1.start();

        myTest2Thread myt2 = new myTest2Thread();
        myt2.start();

        myTest3Thread myt3 = new myTest3Thread();
        myt3.start();

    }
}
