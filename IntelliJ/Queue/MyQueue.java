package Queue;

public class MyQueue {

    private String[] queueArray;
    private int count;

    public MyQueue(int size) {
        this.queueArray = new String[size];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == queueArray.length;

    }

    public void push(String element) {
        if(isFull()) throw new IllegalArgumentException("Queue is full");
        queueArray[count] = element;
        count++;
    }

    public String pop() {
        if(isEmpty()) throw new IllegalArgumentException("Queue is empty");
        String element = queueArray[0];
        resetQueue();
        count--;
        return element;
    }

    private void resetQueue() {
        for(int index = 1; index < queueArray.length; index++) { // to adjust the queue to the first line again
            queueArray[index - 1] = queueArray[index]; // the next queue - 1, it goes back to index 1
        }
    }


    public String peek() {
        return queueArray[0];
    }
}



