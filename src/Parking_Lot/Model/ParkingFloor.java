package Parking_Lot.Model;

import java.util.List;

public class ParkingFloor {
    private int id;
    private int floorNumber;
    private List<ParkingSlot> slots;
    private FloorStatus floorStatus;
    private List<VehicleType> vehicleTypes;
}
