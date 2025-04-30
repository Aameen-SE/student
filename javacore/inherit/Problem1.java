package javacore.inherit;

public class Problem1 {
    public static void main(String[] args) {
        AdvCalculator cal = new AdvCalculator();
        int r1=cal.add(23,45);
        int r2=cal.sub(56,34);
        int r3= cal.multi(23,5);
        int r4=cal.div(45,5);

        System.out.println("r1 : "+r1+" , r2 : "+r2+ " r3 : "+r3+" , r4 : "+r4);

    }
}
