package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    Set<Person> personHashSet = new HashSet<>();
    Set<Address> addressHashSet = new HashSet<>();
    Person xiong = new Person("Xiong", 1990);
    Person gityee = new Person("Gityee", 1993);
    Address home = new Address("111 Real St", "Philadelphia", "00001", "USA");

    @Test
    public void addTest() {
        //Given:
        Set<String> hashset = new HashSet<>();

        //When:
        hashset.add("Hello World");

        //Then:
        Assert.assertFalse(hashset.isEmpty());
    }

    @Test
    public void clearTest() {
        //Given:
        personHashSet.add(xiong);
        personHashSet.add(gityee);

        //When:
        personHashSet.clear();

        //Then:
        Assert.assertTrue(personHashSet.isEmpty());
    }

    @Test
    public void containsTest() {
        //Given:
        personHashSet.add(xiong);
        personHashSet.add(gityee);

        //When:
        boolean expected = true;
        boolean actual = personHashSet.contains(xiong);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest() {
        //Given:
        personHashSet.add(xiong);
        personHashSet.add(gityee);

        //When:
        int expected = 2;
        int actual = personHashSet.size();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        //Given:
        personHashSet.add(xiong);
        personHashSet.add(gityee);

        //When:
        personHashSet.remove(xiong);

        //Then:
        Assert.assertFalse(personHashSet.contains(xiong));
    }

}
