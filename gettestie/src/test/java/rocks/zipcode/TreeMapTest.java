package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class TreeMapTest {
    TreeMap<Person, Address> personAddressTreeMap = new TreeMap<>();
    Person xiong = new Person("Xiong", 1990);
    Person gityee = new Person("Gityee", 1993);
    Address home = new Address("111 Real St", "Philadelphia", "00001", "USA");
    Address home2 = new Address("222 Fake St", "Maryland", "00002", "USA");

    @Test
    public void putTest() {
        //Given: Above

        //When:
        personAddressTreeMap.put(xiong, home);
        Address expected = home;
        Address actual = personAddressTreeMap.get(xiong);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest() {
        //Given:
        personAddressTreeMap.put(xiong, home);
        personAddressTreeMap.put(gityee, home2);

        //When:
        int expected = 2;
        int actual = personAddressTreeMap.size();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsKeyTest() {
        //Given:
        personAddressTreeMap.put(xiong, home);
        personAddressTreeMap.put(gityee, home2);

        //When:
        boolean expected = true;
        boolean actual = personAddressTreeMap.containsKey(gityee);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsKeyFalseTest() {
        //Given:
        personAddressTreeMap.put(xiong, home);
        personAddressTreeMap.put(gityee, home2);
        Person mike = new Person("Mike", 1992);

        //When:
        boolean expected = false;
        boolean actual = personAddressTreeMap.containsKey(mike);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsValueTest() {
        //Given:
        personAddressTreeMap.put(xiong, home);
        personAddressTreeMap.put(gityee, home2);

        //When:
        boolean expected = true;
        boolean actual = personAddressTreeMap.containsValue(home);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsValue2Test() {
        //Given:
        personAddressTreeMap.put(xiong, home);
        personAddressTreeMap.put(gityee, home2);

        //When:
        boolean expected = true;
        boolean actual = personAddressTreeMap.containsValue(home2);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest() {
        //Given:
        personAddressTreeMap.put(xiong, home);
        personAddressTreeMap.put(gityee, home2);

        //When:
        Address expected = home2;
        Address actual = personAddressTreeMap.get(gityee);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTrueTest() {
        //Given: Above

        //When:
        boolean expected = true;
        boolean actual = personAddressTreeMap.isEmpty();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyFalseTest() {
        //Given:
        personAddressTreeMap.put(xiong, home);
        personAddressTreeMap.put(gityee, home2);

        //When:
        boolean expected = false;
        boolean actual = personAddressTreeMap.isEmpty();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void keySetTest() {
        //Given:
        personAddressTreeMap.put(xiong, home);
        personAddressTreeMap.put(gityee, home2);

        //When:
        Set<Person> actual = personAddressTreeMap.keySet();

        //Then:
        Assert.assertTrue(actual.contains(gityee) && actual.contains(xiong));
    }

    @Test
    public void valueSetTest() {
        //Given:
        personAddressTreeMap.put(xiong, home);
        personAddressTreeMap.put(gityee, home2);

        //When:
        Collection<Address> actual = personAddressTreeMap.values();

        //Then:
        Assert.assertTrue(actual.contains(home) && actual.contains(home2));
    }

    @Test
    public void removeTest() {
        //Given:
        personAddressTreeMap.put(xiong, home);
        personAddressTreeMap.put(gityee, home2);

        //When:
        personAddressTreeMap.remove(xiong);

        //Then:
        Assert.assertTrue(personAddressTreeMap.size() == 1);
    }}
