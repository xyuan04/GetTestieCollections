package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class QueueTest {
    Queue<Person> personQueue = new LinkedList<>();
    Person xiong = new Person("Xiong", 1990);
    Person gityee = new Person("Gityee", 1993);

    @Test
    public void testAdd() {
        //Given: Above

        //When:
        personQueue.add(xiong);

        //Then:
        Assert.assertTrue(personQueue.contains(xiong));
    }


    @Test
    public void testAddAll() {
        //Given:
        Person[] personArray = new Person[] {xiong, gityee};

        //When:
        personQueue.addAll(Arrays.asList(personArray));

        //Then:
        Assert.assertTrue(personQueue.size() == 2);
    }


    @Test
    public void testClear() {
        //Given:
        personQueue.add(xiong);
        personQueue.add(gityee);

        //When:
        personQueue.clear();

        //Then:
        Assert.assertTrue(personQueue.isEmpty());
    }

    @Test
    public void testContains() {
        //Given:
        personQueue.add(xiong);
        personQueue.add(gityee);

        //When:
        boolean expected = true;
        boolean actual = personQueue.contains(gityee);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testElement() {
        //Given:
        personQueue.add(xiong);
        personQueue.add(gityee);

        //When:
        Person expected = xiong;
        Person actual = personQueue.element();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPeek() {
        //Given:
        personQueue.add(xiong);
        personQueue.add(gityee);

        //When:
        Person expected = xiong;
        Person actual = personQueue.peek();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        //Given:
        personQueue.add(xiong);
        personQueue.add(gityee);

        //When:
        personQueue.remove(xiong);

        //Then:
        Assert.assertFalse(personQueue.contains(xiong));
    }

    @Test
    public void testRemoveAll() {
        //Given:
        personQueue.add(xiong);
        personQueue.add(gityee);
        Person[] personArray = new Person[] {xiong, gityee};

        //When:
        personQueue.removeAll(Arrays.asList(personArray));

        //Then:
        Assert.assertTrue(personQueue.isEmpty());
    }

    @Test
    public void testSize() {
        //Given:
        personQueue.add(xiong);
        personQueue.add(gityee);

        //When:
        int expected = 2;
        int actual = personQueue.size();

        //Then:
        Assert.assertEquals(expected, actual);
    }
}
