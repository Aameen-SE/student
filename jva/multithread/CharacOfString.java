package jva.multithread;

public class CharacOfString extends Thread {
    public static void main(String[] args) {

        String str = "World";

        for(int i=0;i<str.length();i++){
            final char c= str.charAt(i);

            Thread print =new Thread(()->{
                System.out.println(c);
                try{
                    Thread.sleep(500);
                }catch (Exception e){e.printStackTrace();}

            });
            print.start();
        }
    }
}
