package T;

import code.MyArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyArrayListTest {
    @Test
    public void testIfArrayListIsEmpty() {
        MyArrayList myArrayList = new MyArrayList();
        Assertions.assertTrue(myArrayList.IsEmpty());
    }
    @Test
    public void testIfArrayListIsNotEmpty() {
        MyArrayList myArrayList = new MyArrayList();
        Assertions.assertFalse(myArrayList.IsNotEmpty());
    }
    @Test
    public void addElementToMyArrayList() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        Assertions.assertTrue(myArrayList.IsNotEmpty());
    }
    @Test
    public void removeElementFromMyArrayList() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        Assertions.assertTrue(myArrayList.IsNotEmpty());
        myArrayList.remove(1);
        myArrayList.remove(2);
        myArrayList.remove(3);
        myArrayList.remove(4);
        Assertions.assertFalse(myArrayList.IsNotEmpty());
    }
    @Test
    public void getElementFromMyArrayList() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        Assertions.assertTrue(myArrayList.IsNotEmpty());

        Assertions.assertEquals(2, myArrayList.get(0));
        Assertions.assertEquals(3, myArrayList.get(1));
        Assertions.assertEquals(4, myArrayList.get(2));
        Assertions.assertEquals(5, myArrayList.get(3));

    }

    @Test
    public void testContains() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

        Assertions.assertTrue(myArrayList.contains(1));
        Assertions.assertTrue(myArrayList.contains(2));
        Assertions.assertTrue(myArrayList.contains(3));
        Assertions.assertFalse(myArrayList.contains(4));
    }
    @Test
    public void testClear() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

        Assertions.assertFalse(myArrayList.IsEmpty());

        myArrayList.clear();

        Assertions.assertTrue(myArrayList.IsEmpty());
        Assertions.assertFalse(myArrayList.contains(1));
        Assertions.assertFalse(myArrayList.contains(2));
        Assertions.assertFalse(myArrayList.contains(3));
    }

}

