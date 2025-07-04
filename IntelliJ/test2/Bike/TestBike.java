package Bike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBike {


    @Test
    public void testThatBikeIsOn() {
        Bike myBike = new Bike();
        myBike.TurnOn();
        assertTrue(myBike.isOn());
    }

    @Test
    public void testThatBikeIsOff() {
        Bike myBike = new Bike();
        myBike.TurnOn();
        myBike.TurnOff();
        assertFalse(myBike.isOn());
    }

    @Test
    public void testThatBikeCanAccelerate() {
        Bike myBike = new Bike();
        myBike.TurnOn();
        myBike.setAcceleration(15);
        myBike.increaseAcceleration();
        assertEquals(16, myBike.getAcceleration());
    }

    @Test
    public void testThatBikeCanIncreaseAccelerationByTwo() {
        Bike myBike = new Bike();
        myBike.TurnOn();
        myBike.setAcceleration(24);
        myBike.increaseAcceleration();
        assertEquals(26, myBike.getAcceleration());
    }

    @Test
    public void testThatBikeCanIncreaseAccelerationByThree() {
        Bike myBike = new Bike();
        myBike.TurnOn();
        myBike.setAcceleration(35);
        myBike.increaseAcceleration();
        assertEquals(38, myBike.getAcceleration());
    }

    @Test
    public void testThatBikeCanIncreaseAccelerationByFour() {
        Bike myBike = new Bike();
        myBike.TurnOn();
        myBike.setAcceleration(44);
        myBike.increaseAcceleration();
        assertEquals(48, myBike.getAcceleration());
    }

    @Test
    public void testThatBikeCanDecreaseAcceleration() {
        Bike myBike = new Bike();
        myBike.TurnOff();
        myBike.setAcceleration(15);
        myBike.decreaseAcceleration();
        assertEquals(14, myBike.getAcceleration());
    }

    @Test
    public void testThatBikeCanDecreaseAccelerationByTwo() {
        Bike myBike = new Bike();
        myBike.TurnOn();
        myBike.setAcceleration(24);
        myBike.decreaseAcceleration();
        assertEquals(22, myBike.getAcceleration());
    }

    @Test
    public void testThatBikeCanDecreaseAccelerationByThree() {
        Bike myBike = new Bike();
        myBike.TurnOn();
        myBike.setAcceleration(35);
        myBike.decreaseAcceleration();
        assertEquals(32, myBike.getAcceleration());
    }

    @Test
    public void testThatBikeCanDecreaseAccelerationByFour() {
        Bike myBike = new Bike();
        myBike.TurnOn();
        myBike.setAcceleration(44);
        myBike.decreaseAcceleration();
        assertEquals(40, myBike.getAcceleration());
    }
}
