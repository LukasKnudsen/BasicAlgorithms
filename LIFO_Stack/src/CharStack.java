public class CharStack {
    private final char[] data;
    private int top; 

    public CharStack(int capacity) {
        data = new char[capacity];
        top = 0;
    }

    public void push(char c) {
        data[top++] = c;
    }

    public char pop() {
        return data[--top];
    }

    public char peek() {
        return data[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }
}