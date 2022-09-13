package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(11, 150, 10);
        visitor2 = new Visitor(12, 120, 10);
        visitor3 = new Visitor(12, 150, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void cantRideIfTooYoung(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void cantRideIfTooSmall(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void canRideIfJustRight(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor3));
    }
}
