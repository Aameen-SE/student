package corejava.aug07;

public class RoomMain {
    public static void main(String[] args) {
        Room room = new Room();
        room.setRoomId(1234);
        room.setFloorNum(5);
        room.setSeatCapacity(35);

        System.out.println("RoomId :"+room.getRoomId()+" ; FloorNum :"+room.getFloorNum()+" ; SeatCapacity :"+room.getSeatCapacity());
    }
}
