package corejava.aug10;

import java.time.*;

public class DateTime {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate today = LocalDate.now();
        System.out.println( today.getDayOfMonth());
        System.out.println( today.getDayOfWeek());
        System.out.println( today.getDayOfYear());
        System.out.println( today.getYear());
        System.out.println( today.isLeapYear());
        // today.plusday/Month/Year(""); // today.minus same as plus 
    }
}
