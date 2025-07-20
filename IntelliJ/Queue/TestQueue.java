package Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestQueue {

    private MyQueue myQueue;

    @BeforeEach
    public void QueueSetUp() {
        myQueue = new MyQueue(2);

    }

    @Test
    public void testThatNewQueueIsEmpty() {
        assertTrue(myQueue.isEmpty());
    }

    @Test
    public void testThatQueueIsFull() {
        assertTrue(myQueue.isEmpty());
        myQueue.push("me");
        myQueue.push("us");
        assertTrue(myQueue.isFull());

    }

    @Test
    public void pushCanAddElement() {
        assertTrue(myQueue.isEmpty());
        myQueue.push("me");
        assertFalse(myQueue.isEmpty());
    }

    @Test
    public void popCanRemoveFirstElement() {
        assertTrue(myQueue.isEmpty());
        myQueue.push("me");
        myQueue.push("us");
        assertEquals("me", myQueue.pop());
        assertFalse(myQueue.isEmpty());
    }

    @Test
    public void pushOnePopOneElement() {
        assertTrue(myQueue.isEmpty());
        myQueue.push("me");
        myQueue.pop();
        myQueue.push("us");
        assertEquals("us", myQueue.peek());
    }

    @Test
    public void peekReturnsTheFirstElement() {
        myQueue.push("me");
        myQueue.push("us");
        assertEquals("me", myQueue.peek());
    }

}
