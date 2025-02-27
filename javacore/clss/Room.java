package javacore.clss;

public class Room {
    //Create a class Room having member variables roomId, floorNum, seatCapacity. create getters and  setters for all member variables. Create
    //		object of Room class in other class inside main method and set all member values and print all member values using getters.
    //

    int roomId, floorNum, seatCapacity;

    public void setRoomId(int roomId){
        this.roomId=roomId;
    }
    public int getRoomId(){
        return roomId;
    }

    public void setFloorNum(int floorNum){
        this.floorNum=floorNum;
    }
    public int getFloorNum(){
        return floorNum;
    }

    public void setSeatCapacity(int seatCapacity){
        this.seatCapacity=seatCapacity;
    }

    public int getSeatCapacity(){
        return seatCapacity;
    }

}
