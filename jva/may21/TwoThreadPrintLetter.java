package jva.may21;
//Alternate Printing of Letters and Number  Using Two Threads

class AlphaThread implements Runnable{
    private String msg;
        public AlphaThread(String msg){
            this.msg=msg;
        }
    @Override
    public void run() {
    for(char i= 'A';i<='Z';i++){
        System.out.println(msg+" : "+i);
        try{
            Thread.sleep(500);
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }
    }
    }

}

class NumberThread implements Runnable{
    private  String msg;

    public NumberThread(String msg){
        this.msg=msg;
    }
    @Override
    public void run() {
        for(int i=1;i<=26;i++){
            System.out.println(msg+" : "+i);
            try{
                Thread.sleep(500);
            }catch (Exception e){
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class TwoThreadPrintLetter {
    public static void main(String[] args) {
        Thread alphaThread = new Thread( new AlphaThread("Alphabet Thread  "));
        Thread numThread = new Thread(new NumberThread("Number Thread "));

        alphaThread.start();
        numThread.start();

    }
}
