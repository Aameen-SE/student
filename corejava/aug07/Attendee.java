package corejava.aug07;

public class Attendee {
    //Create a class Attendee having member variables attendeeId, firstName, lastName, phone, email, vip. create getters and setters for all
    //		member variables. Create object of Attendee class in other class inside main method and set all member values and print all member values
    //		using getters.

    private int attendeeId;
    private String firstName;
    private String lastName;
    private String phone;
    private boolean vip;

    public void setAttendeeId(int attendeeId) {
        this.attendeeId = attendeeId;
    }

    public int getAttendeeId() {
        return attendeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public boolean isVip() {
        return vip;
    }

}
