package threadandmultithread;

public class ThreadBasicRunner {

    static class Task1 extends Thread{
        public void run(){
            System.out.println("Task1 start \n");
            for(int i=0;i<=10;i++){
                System.out.print(i+" ");
            }
            System.out.println("Task1 done\n");
        }
    }

static class Task2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Task2 start");
        for(int i=11;i<=20;i++){
            System.out.print(i+" ");
        }
        System.out.println("Task2 ended");
    }
}

    public static void main(String[] args) throws InterruptedException {
        // mostly two ways for thread is extend and implement runnable

        System.out.println("Task1 kicked off");
        Task1 task1 = new Task1();

        // setting priority as we know max = 10,min =1,normal =5
        task1.setPriority(10);
        task1.start();
        System.out.println("\ntask2 kicked off");
        Task2 task2 = new Task2();
        Thread task2thread = new Thread(task2);
        task2thread.setPriority(1);
        task2thread.start();

        // connection between thread
        // we want to end task1 before task3 is started so
        //wait for task1 to end
        task1.join();

        //Task3
        System.out.println("Task3 is kicked off ");
        System.out.println("Task 3 is started ");
        for(int i =100;i<=200;i++){
            System.out.print(i+" ");
        }
        System.out.println("Task3 ended ");

        System.out.println("Main Ended");
    }
}
