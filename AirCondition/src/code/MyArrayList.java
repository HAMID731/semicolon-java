package code;

public class MyArrayList {
    private int size = 0;
    private final boolean IsEmpty = true;
    private int[] elements = new int[10];

    public boolean IsEmpty() {
        return size==0;
    }
    public boolean IsNotEmpty() {
        return size>0;
    }
    public void add(int value) {
        if (value<elements.length) {
            elements[size] = value;
            size++;
        }
    }
    public int size() {
        return size;
    }
    public void remove(int value) {
        if (value<elements.length) {
            elements[size-1] = value;
            size--;
        }
    }
    public Object get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == value) {
                return true;
            }
        }
        return false;
    }
    public void clear() {
        elements = new int[10]; // Reset to initial capacity
        size = 0;
    }
}