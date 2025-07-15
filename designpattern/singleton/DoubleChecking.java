package designpattern.singleton;
class Dc{

    static Dc obj;

    private Dc(){
        System.out.println("Instance Created");
    }

    public static Dc getInstance(){
        if(obj==null){

            synchronized (Dc.class){
                if(obj==null)
                    obj=new Dc();
            }
        }
        return obj;
    }
}
public class DoubleChecking {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Dc obj1 = Dc.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Dc obj2 = Dc.getInstance();
            }
        });

       t1.start();
       t2.start();
    }
}
