package jva.may03;

public class Presentation {
    //Create a class Presentation having member variables presentationId,
    // bookedCompanyId, bookedRoomId, startTime, endTime. Create getters and
    //		setters for all member variables. Create object of Presentation
    //		class in other class inside main method and set all member values and print
    //		all member values using getters.

    private int presentationId;
    private  int bookedCompanyId;
    private int bookedRoomId;

    public Presentation(int presentationId, int bookedRoomId, int bookedCompanyId){
        this.bookedCompanyId=bookedCompanyId;
        this.presentationId=presentationId;
        this.bookedRoomId=bookedRoomId;
    }

    public void setPresentationId(int presentationId){
        this.presentationId=presentationId;
    }
    public int getPresentationId(){
        return presentationId;
    }

    public void setBookedCompanyId(int bookedCompanyId) {
        this.bookedCompanyId = bookedCompanyId;
    }

    public int getBookedCompanyId() {
        return bookedCompanyId;
    }

    public void setBookedRoomId(int bookedRoomId) {
        this.bookedRoomId = bookedRoomId;
    }

    public int getBookedRoomId() {
        return bookedRoomId;
    }

    @Override
    public String toString() {
        return "Presentation Id : "+presentationId+" , Booked Room Id : "+bookedRoomId+" , Booked Company Id :  "+bookedCompanyId;
    }
}
