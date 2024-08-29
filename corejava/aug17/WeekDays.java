package corejava.aug17;

public class WeekDays {
    public static void main(String[] args) {
        // Find the days with most character and print the day os week backward.

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday","Wednesday","Thursday",
                "Friday","Saturday"};

        String daysWithMostCharacter ="";

        for(String day :daysOfWeek){
            if(day.length()> daysWithMostCharacter.length()){
                daysWithMostCharacter=day;
            }
        }
        System.out.println("Days with the most character : "+daysWithMostCharacter);

        System.out.println("Days of week in reversed order : ");
        for(int i = daysOfWeek.length-1;i>=0;i--){
            System.out.print(daysOfWeek[i]+" ;");
        }

    }


}
