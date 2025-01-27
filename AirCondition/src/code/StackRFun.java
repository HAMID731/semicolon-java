package code;

public class StackRFun {
    private int[] elements;
    private int stackSize;

    public StackRFun() {
        elements = new int[10];
        stackSize = 0;
    }

    public boolean isEmpty() {
        return stackSize == 0;
    }

    public boolean isNotEmpty() {
        return stackSize != 0;
    }

    public void add(Integer element) {
        if (stackSize < elements.length) {
            elements[stackSize] = element;
            stackSize++;
        }
    }

    public void remove(Integer element) {
        for (int i = 0; i < stackSize; i++) {
            if (elements[i] == element) {
                // shift elements to the left
                for (int j = i; j < stackSize - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                stackSize--;
                break;
            }
        }
    }

    public int pop() {
        if (stackSize == 0) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return elements[--stackSize];
    }
    public int peek() {
        if (stackSize == 0) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return elements[stackSize - 1];
    }
    public void push(Integer element) {
        if (stackSize == elements.length) {
            throw new IndexOutOfBoundsException("Stack is full");
        }
        elements[stackSize] = element;
        stackSize++;
    }
}
