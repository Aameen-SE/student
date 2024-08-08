package corejava.aug07;

public class AttendeeMain {
    public static void main(String[] args) {
        Attendee attendee = new Attendee();

        attendee.setAttendeeId(123);
        attendee.setFirstName("Aameen");
        attendee.setLastName("Hussain");
        attendee.setPhone("6290543434");
        attendee.setVip(true);

        System.out.println("Attendee :"+attendee.getAttendeeId()+" ; FirstName :"+attendee.getFirstName()+" ; " +
                "LastName :"+attendee.getLastName()+" ; Phone :"+attendee.getPhone()+" ; Vip :"+attendee.isVip());
    }
}
