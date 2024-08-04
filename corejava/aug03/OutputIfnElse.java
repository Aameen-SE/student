package corejava.aug03;

public class OutputIfnElse {
    public static void main(String[] args) {

      //  output1();
       // output2();
        output3();
    }
    public static void output1()
    {
        boolean a, b, c;
        a = b = c = true;
        if( !a || ( b && c ) ) {
            System.out.println("If executed");
        }
        else {
            System.out.println("else executed");
        }
    }
    public static void output2(){
        int a = 7 * 3 + 6 / 2 - 5;
        int b = 21 - 8 + a % 3 * 11;
        if(a < b) {
            System.out.println("A is less than B");
        }
        if(a == b) {
            System.out.println("A is equal to B");
        }
        if(a > b) {
            System.out.println("A is greater than B");
        }
    }

    public static void output3(){
        int a = 12 + 21 * 3 - 9 / 2;
        int b = 14 - 32 * 4 + 175 / 8 - 3;
        if(++a > 71 && --b < 20) {
            System.out.println("a = " + a + " b = " + b);
        }
        if(b-- == -97 || a-- < 100) {
            System.out.println("a = " + a + " b = " + b);
        }
    }
}
