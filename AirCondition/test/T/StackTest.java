package T;

import code.StackRFun;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class StackTest {
    StackRFun stackRFun = new StackRFun();

    @Test
    public void IsEmpty() {
        assertTrue(stackRFun.isEmpty());
    }

    @Test
    public void IsNotEmpty() {
        stackRFun.add(54);
        assertTrue(stackRFun.isNotEmpty());
    }

    @Test
    public void addToStack() {
        stackRFun.add(54);
        stackRFun.add(23);
        stackRFun.add(34);
        assertTrue(stackRFun.isNotEmpty());
    }

    @Test
    public void removeFromStack() {
        stackRFun.add(98);
        stackRFun.remove(98);
        assertTrue(stackRFun.isEmpty());
    }

    @Test
    public void popFromStack() {
        stackRFun.add(98);
        stackRFun.add(34);
        stackRFun.add(76);
        stackRFun.add(75);
        assertEquals(75, stackRFun.pop());
        assertEquals(76, stackRFun.pop());
    }
    @Test
    public void peekFromStack() {
        stackRFun.add(98);
        stackRFun.add(34);
        stackRFun.add(76);
        stackRFun.add(75);
        assertEquals(75, stackRFun.peek());
    }
    @Test
    public void pushToStack() {
        stackRFun.add(98);
        stackRFun.add(34);
        stackRFun.add(76);
        stackRFun.add(75);
        stackRFun.push(34);
        assertTrue(stackRFun.isNotEmpty());
    }
}

