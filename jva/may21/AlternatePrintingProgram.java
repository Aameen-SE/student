package jva.may21;
class AlternatePrinter{
    private final char[] letters1 ={'A','B','C','D','E'};
    private final char[] letters2 ={'1','2','3','4','5'};
    private boolean turnFirst =true;

    public synchronized void printFirst(){
        for(char c:letters1){
            while (!turnFirst){
                try{
                    wait();
                }catch (Exception e){Thread.currentThread().interrupt();
                }
            }
            System.out.println(c);
            turnFirst=false;
            notify();
        }
    }

    public synchronized void printSecond(){
        for(char c: letters2){
            while(turnFirst){
                try{
                    wait();
                }catch (Exception e){
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(c);
            turnFirst=true;
            notify();
        }

    }
}
public class AlternatePrintingProgram {
    public static void main(String[] args) {
        AlternatePrinter printer=new AlternatePrinter();
        Thread th1 = new Thread(printer::printFirst);
        Thread th2 = new Thread(printer::printSecond);
        th1.start();
        th2.start();
    }
}
