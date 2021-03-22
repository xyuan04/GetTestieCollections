package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    PriorityQueue<Person> personPriorityQueue = new PriorityQueue<>();
    Person xiong = new Person("Xiong", 1990);
    Person gityee = new Person("Gityee", 1993);

    @Test
    public void addTest() {
        //Given: Above

        //When:
        personPriorityQueue.add(xiong);

        //Then:
        Assert.assertTrue(personPriorityQueue.contains(xiong));
    }

    @Test
    public void peakTest() {
        //Given: Above

        //When:
        Person expected = null;
        Person actual = personPriorityQueue.peek();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void peakWithPersonAddedTest() {
        //Given:
        personPriorityQueue.add(xiong);

        //When:
        Person expected = xiong;
        Person actual = personPriorityQueue.peek();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void offerTest() {
        //Given:
        personPriorityQueue.add(xiong);

        //When:
        personPriorityQueue.offer(gityee);

        //Then:
        Assert.assertTrue(personPriorityQueue.contains(gityee));
    }

    @Test
    public void clearTest() {
        //Given:
        personPriorityQueue.add(xiong);

        //When:
        personPriorityQueue.clear();

        //Then:
        Assert.assertTrue(personPriorityQueue.isEmpty());
    }

    @Test
    public void sizeTest() {
        //Given:
        personPriorityQueue.add(xiong);

        //When:
        personPriorityQueue.offer(gityee);

        //Then:
        Assert.assertTrue(personPriorityQueue.size() == 2);
    }

    @Test
    public void pollTest() {
        //Given:
        personPriorityQueue.add(xiong);
        personPriorityQueue.offer(gityee);

        //When:
        Person actual = personPriorityQueue.poll();

        //Then:
        Assert.assertTrue(actual == xiong);
    }
}
