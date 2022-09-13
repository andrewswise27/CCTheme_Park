package stalls;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class TobaccoStall extends Stall implements ITicketed, ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public double defaultPrice() {
        return 10;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 10;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 18){
            return false;
        }
        return true;
    }
}
