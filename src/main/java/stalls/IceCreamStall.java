package stalls;

import behaviours.ITicketed;
import people.Visitor;

public class IceCreamStall extends Stall implements ITicketed {

    public IceCreamStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public double defaultPrice() {
        return 2;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 2;
    }
}
