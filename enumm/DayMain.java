package enumm;
//Create an enum called Day that has constants for all days of the week (MONDAY, TUESDAY, ..., SUNDAY).
//
//Write a Java method called isWeekend(Day day) that returns true if the day is SATURDAY or SUNDAY, otherwise returns false.

enum Day{
    Saturday , Monday, Tuesday , Wednesday , Thursday , Friday,  Sunday;
}
public class DayMain {

    public static boolean isWeekend(Day day){
        return day== Day.Saturday || day==Day.Sunday;
    }

    public static void main(String[] args) {

        for(Day d : Day.values()){
            System.out.println(d +" : is weekend :"+isWeekend(d));
        }
    }
}
