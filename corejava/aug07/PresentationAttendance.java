package corejava.aug07;

public class PresentationAttendance {

    //      Create a class PresentationAttendance having member variables ticketId, presentationId, attendeeId. create getters and setters for all
    //		member variables. Create object of PresentationAttendance class in other class inside main method and set all member values and print all
    //		member values using getters.
    private int ticketId;
    private int presentaionId;
    private int attendeeId;

    public void setAttendeeId(int attendeeId) {
        this.attendeeId = attendeeId;
    }

    public int getAttendeeId() {
        return attendeeId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setPresentaionId(int presentaionId) {
        this.presentaionId = presentaionId;
    }

    public int getPresentaionId() {
        return presentaionId;
    }

}
