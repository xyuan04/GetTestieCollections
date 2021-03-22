package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {
    Deque<Person> personDeque = new ArrayDeque<>();
    Person xiong = new Person("Xiong", 1990);
    Person gityee = new Person("Gityee", 1993);

    @Test
    public void addTest() {
        //Given: Above

        //When:
        personDeque.add(xiong);

        //Then:
        Assert.assertTrue(personDeque.contains(xiong));
    }

    @Test
    public void addFirstTest() {
        //Given:
        personDeque.add(xiong);
        personDeque.add(gityee);
        Person mike = new Person("Mike", 1992);

        //When:
        personDeque.addFirst(mike);

        //Then:
        Assert.assertSame(personDeque.getFirst(), mike);
    }

    @Test
    public void addLastTest() {
        //Given:
        personDeque.add(xiong);
        personDeque.add(gityee);
        Person mike = new Person("Mike", 1992);

        //When:
        personDeque.addLast(mike);

        //Then:
        Assert.assertSame(personDeque.getLast(), mike);
    }

    @Test
    public void isEmptyTrueTest() {
        //Given:
        Person mike = new Person("Mike", 1992);

        //When:
        boolean expected = true;
        boolean actual = personDeque.isEmpty();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyFalseTest() {
        //Given:
        personDeque.add(xiong);

        //When:
        boolean expected = false;
        boolean actual = personDeque.isEmpty();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void offerTest() {
        //Given:
        personDeque.add(xiong);
        personDeque.add(gityee);
        Person mike = new Person("Mike", 1992);

        //When:
        personDeque.offer(mike);

        //Then:
        Assert.assertSame(personDeque.getLast(), mike);
    }

    @Test
    public void remove() {
        //Given:
        personDeque.add(xiong);
        personDeque.add(gityee);

        //When:
        personDeque.remove(xiong);

        //Then:
        Assert.assertFalse(personDeque.contains(xiong));
    }

    @Test
    public void sizeTest() {
        //Given:
        personDeque.add(xiong);
        personDeque.add(gityee);
        Person mike = new Person("Mike", 1992);

        //When:
        personDeque.addLast(mike);
        int expected = 3;
        int actual = personDeque.size();

        //Then:
        Assert.assertEquals(expected, actual);
    }
}
