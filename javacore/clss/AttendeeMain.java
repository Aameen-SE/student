package javacore.clss;

public class AttendeeMain {
    public static void main(String[] args) {

        Attendee attendee = new Attendee();
        attendee.setAttendeeId(12);
        attendee.setFirstName("Aameen");
        attendee.setLastName("Hussain");
        attendee.setEmail("aameen@gmail.com");
        attendee.setVip(false);
        attendee.setPhone(1234567890l);

        System.out.println("attendeeId : "+attendee.getAttendeeId()+" firstName : "+attendee.getFirstName()+" lastName : "+attendee.lastName +" phone : " +attendee.getPhone()
                +" email :"+attendee.getEmail()+" vip : "+attendee.getVip());
    }
}
