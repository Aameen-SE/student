package javacore.clss;

import java.util.Date;

public class Presentation {
    //Create a class Presentation having member variables presentationId, bookedCompanyId, bookedRoomId, startTime, endTime. Create getters and
    //		setters for all member variables. Create object of Presentation class in other class inside main method and set all member values and print
    //		all member values using getters.

   int presentationId, bookedCompanyId, bookedRoomId;

    public void setPresentationId(int presentationId) {
        this.presentationId = presentationId;
    }

    public int getPresentationId() {
        return presentationId;
    }

    public void setBookedCompanyId(int bookedCompanyId){
        this.bookedCompanyId=bookedCompanyId;
    }

    public int getBookedCompanyId(){
        return bookedCompanyId;
    }

    public void setBookedRoomId(int bookedRoomId){
        this.bookedRoomId=bookedRoomId;
    }
    public int getBookedRoomId(){
        return bookedRoomId;
    }

}
