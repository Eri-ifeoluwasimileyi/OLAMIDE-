package toggle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestToggle {


    @Test
    public void testThatToggleIsTurnedOn() {
        MyToggle myToggle = new MyToggle();
        myToggle.toggle();
        assertTrue(myToggle.isOn());
    }

    @Test
    public void testThatToggleIsTurnedOff() {
        MyToggle myToggle = new MyToggle();
        myToggle.toggle();
        myToggle.toggle();
        assertFalse(myToggle.isOn());
    }
}
