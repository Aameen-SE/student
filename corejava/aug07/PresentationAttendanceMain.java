package corejava.aug07;

public class PresentationAttendanceMain {
    public static void main(String[] args) {
        PresentationAttendance presentationAttendance = new PresentationAttendance();

        presentationAttendance.setAttendeeId(1456);
        presentationAttendance.setPresentaionId(2458);
        presentationAttendance.setTicketId(144);

        System.out.println("AttendeeId :"+presentationAttendance.getAttendeeId()+" ; " +
                "PresentationId :"+presentationAttendance.getPresentaionId()+" ; TicketId :"+presentationAttendance.getTicketId());
    }
}
