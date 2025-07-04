import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    private Stack strings;

    @BeforeEach
    public void stackSetUp() {
        strings = new Stack(5);
    }

    @Test
    public void newStackIsEmpty() {
        assertTrue(strings.isEmpty());
    }

    @Test
    public void pushNewStackToStack() {
        assertTrue(strings.isEmpty());
        strings.push("Chairs");
        assertFalse(strings.isEmpty());
    }

    @Test
    public void pushOneNewStackAndPopOneStackFromStack() {
        assertTrue(strings.isEmpty());
        strings.push("Chairs");
        assertFalse(strings.isEmpty());
        strings.pop();
        assertTrue(strings.isEmpty());
    }

    @Test
    public void pushTwoNewStackAndPopOneStackFromStack() {
        assertTrue(strings.isEmpty());
        strings.push("Chairs");
        strings.push("Clothes");
        assertFalse(strings.isEmpty());
        strings.pop();
        assertFalse(strings.isEmpty());
    }

    @Test
    public void pushMPopShouldReturnTheSameStack() {
        strings.push("Chairs");
        assertEquals("Chairs", strings.pop());
    }

    @Test
    public void pushMNPopShouldReturnXFromStack() {
        strings.push("Chairs");
        strings.push("Clothes");
        assertEquals("Clothes", strings.pop());
    }
}
