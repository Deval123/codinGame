package ocp.static_initializer;

/**
 * @author $ Devalère
 **/

// File: TestOrder.java
class Hotel {
    private int noOfRooms = 12;
    private int maxNoOfGuests = initMaxGuests();
    private int occupancyPerRoom = 2;
    public int initMaxGuests() {
        System.out.println("occupancyPerRoom: " + occupancyPerRoom);
        System.out.println("maxNoOfGuests: " + noOfRooms * occupancyPerRoom);
        return noOfRooms * occupancyPerRoom;
    }
    public int getMaxGuests() { return maxNoOfGuests; }
    public int getOccupancy() { return occupancyPerRoom; }
}
//________________________________________________________________
public class TestOrder {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        System.out.println("AFTER OBJECT CREATION");
        System.out.println("occupancyPerRoom: " + hotel.getOccupancy());
        System.out.println("maxNoOfGuests: " + hotel.getMaxGuests());
    }
}
