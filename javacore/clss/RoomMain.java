package javacore.clss;

public class RoomMain {
    public static void main(String[] args) {

        Room room = new Room();
        room.setRoomId(12);
        room.setFloorNum(15);
        room.setSeatCapacity(200);

        System.out.println("RoomId : "+room.getRoomId()+" FloorNum : "+room.getFloorNum()+" SeatCapacity : "+room.getSeatCapacity());
    }
}
