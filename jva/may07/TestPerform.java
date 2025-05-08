package jva.may07;

public class TestPerform extends Thread {
    // creating thread
    public void run(){}
    public static void main(String[] args) {
    TestPerform testPerform = new TestPerform();
    testPerform.start();
    }
}
