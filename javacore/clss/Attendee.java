package javacore.clss;

public class Attendee {
    //4.	Create a class Attendee having member variables attendeeId, firstName, lastName, phone, email, vip. create getters and setters for all
    //		member variables. Create object of Attendee class in other class inside main method and set all member values and print all member values
    //		using getters.
                  int attendeeId;
                  String firstName, lastName ,email;
                    Long phone;
                    Boolean vip;

                    public void setAttendeeId(int attendeeId){
                        this.attendeeId=attendeeId;
                    }
                    public int getAttendeeId(){
                        return attendeeId;
                    }

                    public void setFirstName(String firstName){
                        this.firstName=firstName;
                    }
                    public String getFirstName(){
                        return firstName;
                    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

}
