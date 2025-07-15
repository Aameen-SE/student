package designpattern.singleton;
class Dgp {

    static  Dgp obj ;

    private Dgp(){
        System.out.println("Instance created ");
    }

    public static synchronized Dgp getInstance(){

        if(obj==null){
            obj=new Dgp();
        }
        return  obj;
    }

}
public class SynchronizedInstanceCreation {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Dgp obj1 = Dgp.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Dgp obj2 = Dgp.getInstance();
            }
        });

        t1.start();
        t2.start();

    }
}
