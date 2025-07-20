package Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    private MyStack strings;

    @BeforeEach
    public void stackSetUp() {
        strings = new MyStack(2);
    }

    @Test
    public void newStackIsEmpty() {
        assertTrue(strings.isEmpty());
    }

    @Test
    public void newStackIsFull() {
        strings.push("chairs");
        strings.push("clothes");
        assertTrue(strings.isFull());
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
    public void pushMNPopShouldReturnNMFromStack() {
        strings.push("Chairs");
        strings.push("Clothes");
        assertEquals("Clothes", strings.pop());
        assertEquals("Chairs", strings.pop());
        assertTrue(strings.isEmpty());
    }

    @Test
    public void getStackArrayReturnCorrectStack() {
        strings.push("Chairs");
        strings.push("Clothes");
        String [] result = strings.getStack();
        assertEquals("Chairs", result[0]);
        assertEquals("Clothes", result[1]);
    }


    @Test
    public void peekStackReturnTopStack() {
        strings.push("Chairs");
        strings.push("Clothes");
        assertEquals("Clothes", strings.peek());
        assertFalse(strings.isEmpty());
        assertEquals(2, strings.getStack().length);
    }

    @Test
    public void peekStackReturnEmptyStack() {
        assertTrue(strings.isEmpty());
        strings.push("Chairs");
        strings.push("Clothes");
        assertTrue(strings.isFull());

    }
}

