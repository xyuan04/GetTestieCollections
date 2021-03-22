package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    Set<Person> personTreeSet = new TreeSet<>();
    Person xiong = new Person("Xiong", 1990);
    Person gityee = new Person("Gityee", 1993);


    @Test
    public void addTest() {
        //Given: Above

        //When:
        personTreeSet.add(xiong);

        //Then:
        Assert.assertTrue(personTreeSet.contains(xiong));
    }

    @Test
    public void clearTest() {
        //Given:
        personTreeSet.add(xiong);
        personTreeSet.add(gityee);

        //When:
        personTreeSet.clear();

        //Then:
        Assert.assertTrue(personTreeSet.isEmpty());
    }

    @Test
    public void containsTest() {
        //Given:
        personTreeSet.add(xiong);
        personTreeSet.add(gityee);

        //When:
        boolean expected = true;
        boolean actual = personTreeSet.contains(xiong);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest() {
        //Given:
        personTreeSet.add(xiong);
        personTreeSet.add(gityee);

        //When:
        int expected = 2;
        int actual = personTreeSet.size();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        //Given:
        personTreeSet.add(xiong);
        personTreeSet.add(gityee);

        //When:
        personTreeSet.remove(xiong);

        //Then:
        Assert.assertFalse(personTreeSet.contains(xiong));
    }
}
