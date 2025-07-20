package Stack;

public class MyStack {

        private int count;
        private String[] stackArray;

        public MyStack(int size) {
            this.stackArray = new String[size];
        }

        public boolean isEmpty() {
            return count == 0;
        }

        public boolean isFull() {
            return count == stackArray.length;
        }

        public void push(String element) {
            if(isFull()) throw new IllegalStateException("Stack is full");
            stackArray[count] = element;
                this.count++;
        }

        public String pop() {
            if(isEmpty()) throw new IllegalArgumentException("Stack is empty");
            this.count--;
            String element = stackArray[count];
            resetStack();
            return element;
        }

        private void resetStack(){
            String[] remaining = new String[stackArray.length];
            int remainingIndex = 0;
            for(int index = 0; index < stackArray.length; index++) {
                if(index != this.count){
                    remaining[remainingIndex] = stackArray[index];
                    remainingIndex++;
                }
            }
            this.stackArray = remaining;
        }


        public String [] getStack() {
            return this.stackArray;
        }

        public String peek() {
            return stackArray[count - 1];
        }
    }

