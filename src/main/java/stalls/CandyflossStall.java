package stalls;

import behaviours.ITicketed;
import people.Visitor;

public class CandyflossStall extends Stall implements ITicketed {

    public CandyflossStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }


    @Override
    public double defaultPrice() {
        return 5;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 5;
    }
}
