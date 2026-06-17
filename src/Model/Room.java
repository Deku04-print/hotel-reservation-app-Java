package Model;

class Room implements IRoom  {

    String roomNumber;
    Double price;
    RoomType enumeration;


    @Override
    public String getRoomNumber() {
        return "";
    }

    @Override
    public double getRoomPrice() {
        return 0;
    }

    @Override
    public RoomType getRoomType() {
        return null;
    }

    @Override
    public boolean isFree() {
        return false;
    }
}
