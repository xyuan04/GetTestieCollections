package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorTest {
    Vector personVector = new Vector();
    Person xiong = new Person("Xiong", 1990);
    Person gityee = new Person("Gityee", 1993);

    @Test
    public void testAdd() {
        //Given: Above

        //When:
        personVector.add(xiong);

        //Then:
        Assert.assertTrue(personVector.contains(xiong));
    }

    @Test
    public void testIndexAdd() {
        //Given:
        personVector.add(xiong);
        personVector.add(gityee);
        Person mike = new Person("Mike", 1992);

        //When:
        personVector.add(0, mike);

        //Then:
        Assert.assertSame(personVector.get(0), mike);
    }

    @Test
    public void testAddAll() {
        //Given:
        Person[] personArray = new Person[] {xiong, gityee};

        //When:
        personVector.addAll(Arrays.asList(personArray));

        //Then:
        Assert.assertTrue(personVector.size() == 2);
    }

    @Test
    public void testClear() {
        //Given:
        personVector.add(xiong);
        personVector.add(gityee);

        //When:
        personVector.clear();

        //Then:
        Assert.assertTrue(personVector.isEmpty());
    }

    @Test
    public void testContains() {
        //Given:
        personVector.add(xiong);
        personVector.add(gityee);

        //When:
        boolean expected = true;
        boolean actual = personVector.contains(gityee);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet() {
        //Given:
        personVector.add(xiong);
        personVector.add(gityee);

        //When:
        boolean expected = true;
        boolean actual = personVector.get(0).equals(xiong);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIndexOf() {
        //Given:
        personVector.add(xiong);
        personVector.add(gityee);

        //When:
        int expected = 1;
        int actual = personVector.indexOf(gityee);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        //Given:
        personVector.add(xiong);
        personVector.add(gityee);

        //When:
        personVector.remove(xiong);

        //Then:
        Assert.assertFalse(personVector.contains(xiong));
    }

    @Test
    public void testRemoveAll() {
        //Given:
        personVector.add(xiong);
        personVector.add(gityee);
        Person[] personArray = new Person[] {xiong, gityee};

        //When:
        personVector.removeAll(Arrays.asList(personArray));

        //Then:
        Assert.assertTrue(personVector.isEmpty());
    }

    @Test
    public void testSize() {
        //Given:
        personVector.add(xiong);
        personVector.add(gityee);

        //When:
        int expected = 2;
        int actual = personVector.size();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSet() {
        //Given:
        personVector.add(xiong);
        personVector.add(gityee);

        //When:
        personVector.set(1, xiong);

        //Then:
        Assert.assertSame(personVector.get(1), xiong);
    }
}
