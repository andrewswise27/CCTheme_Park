package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class Playground extends Attraction implements ISecurity, ITicketed {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() > 15){
            return false;
        }
        return true;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() >= 200){
            return defaultPrice() * 2;
        }
        else return defaultPrice();
    }
}
