package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class MapTest {
    Map<Person, Address> personAddressMap = new HashMap<>();
    Person xiong = new Person("Xiong", 1990);
    Person gityee = new Person("Gityee", 1993);
    Address home = new Address("111 Real St", "Philadelphia", "00001", "USA");
    Address home2 = new Address("222 Fake St", "Maryland", "00002", "USA");

    @Test
    public void putTest() {
        //Given: Above

        //When:
        personAddressMap.put(xiong, home);
        Address expected = home;
        Address actual = personAddressMap.get(xiong);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest() {
        //Given:
        personAddressMap.put(xiong, home);
        personAddressMap.put(gityee, home2);

        //When:
        int expected = 2;
        int actual = personAddressMap.size();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsKeyTest() {
        //Given:
        personAddressMap.put(xiong, home);
        personAddressMap.put(gityee, home2);

        //When:
        boolean expected = true;
        boolean actual = personAddressMap.containsKey(gityee);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsKeyFalseTest() {
        //Given:
        personAddressMap.put(xiong, home);
        personAddressMap.put(gityee, home2);
        Person mike = new Person("Mike", 1992);

        //When:
        boolean expected = false;
        boolean actual = personAddressMap.containsKey(mike);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsValueTest() {
        //Given:
        personAddressMap.put(xiong, home);
        personAddressMap.put(gityee, home2);

        //When:
        boolean expected = true;
        boolean actual = personAddressMap.containsValue(home);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsValue2Test() {
        //Given:
        personAddressMap.put(xiong, home);
        personAddressMap.put(gityee, home2);

        //When:
        boolean expected = true;
        boolean actual = personAddressMap.containsValue(home2);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest() {
        //Given:
        personAddressMap.put(xiong, home);
        personAddressMap.put(gityee, home2);

        //When:
        Address expected = home2;
        Address actual = personAddressMap.get(gityee);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTrueTest() {
        //Given: Above

        //When:
        boolean expected = true;
        boolean actual = personAddressMap.isEmpty();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyFalseTest() {
        //Given:
        personAddressMap.put(xiong, home);
        personAddressMap.put(gityee, home2);

        //When:
        boolean expected = false;
        boolean actual = personAddressMap.isEmpty();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void keySetTest() {
        //Given:
        personAddressMap.put(xiong, home);
        personAddressMap.put(gityee, home2);

        //When:
        Set<Person> actual = personAddressMap.keySet();

        //Then:
        Assert.assertTrue(actual.contains(gityee) && actual.contains(xiong));
    }

    @Test
    public void valueSetTest() {
        //Given:
        personAddressMap.put(xiong, home);
        personAddressMap.put(gityee, home2);

        //When:
        Collection<Address> actual = personAddressMap.values();

        //Then:
        Assert.assertTrue(actual.contains(home) && actual.contains(home2));
    }

    @Test
    public void removeTest() {
        //Given:
        personAddressMap.put(xiong, home);
        personAddressMap.put(gityee, home2);

        //When:
        personAddressMap.remove(xiong);

        //Then:
        Assert.assertTrue(personAddressMap.size() == 1);
    }
}
