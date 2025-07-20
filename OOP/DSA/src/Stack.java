public class Stack {

    private int count;
    private String stuffs;

    public Stack(int size) {
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void push(String stuffs) {
        this.stuffs = stuffs;
        count++;
    }

    public String pop() {
        count--;
        return stuffs;

    }
}
