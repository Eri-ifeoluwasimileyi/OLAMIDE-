package AC;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAC {

    @Test
    public void testThatACIsOn() {
        AC airCon = new AC();
        airCon.TurnACOn();
        assertTrue(airCon.isOn());
    }

    @Test
    public void testThatACIsOff() {
        AC airCon = new AC();
        airCon.TurnACOn();
        airCon.TurnACOff();
        assertFalse(airCon.isOn());
    }

    @Test
    public void testThatACTemperatureCanIncrease() {
        AC airCon = new AC();
        airCon.TurnACOn();
        airCon.increaseTemperature();
        assertEquals(17, airCon.getTemperature());
    }

    @Test
    public void testThatACTemperatureCanDecrease() {
        AC airCon = new AC();
        airCon.TurnACOn();
        airCon.setTemperature(23);
        airCon.decreaseTemperature();
        assertEquals(22, airCon.getTemperature());
    }

    @Test
    public void testThatACCannotIncreaseBeyondThirty() {
        AC airCon = new AC();
        airCon.TurnACOn();
        airCon.setTemperature(30);
        airCon.increaseTemperature();
        assertEquals(30, airCon.getTemperature());
    }

    @Test
    public void testThatACCannotDecreaseBeyondSixteen() {
        AC airCon = new AC();
        airCon.TurnACOn();
        airCon.setTemperature(16);
        airCon.decreaseTemperature();
        assertEquals(16, airCon.getTemperature());
    }

    @Test
    public void testThatACCannotIncreaseWhenTurnedOff() {
        AC airCon = new AC();
        airCon.TurnACOff();
        airCon.setTemperature(18);
        airCon.increaseTemperature();
        assertEquals(0, airCon.getTemperature());
    }


    @Test
    public void testThatACCannotDecreaseWhenTurnedOff() {
        AC airCon = new AC();
        airCon.TurnACOff();
        airCon.setTemperature(18);
        airCon.decreaseTemperature();
        assertEquals(0, airCon.getTemperature());
    }

}
