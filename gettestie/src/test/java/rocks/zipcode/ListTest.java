package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    List<Person> personList = new ArrayList<>();
    Person xiong = new Person("Xiong", 1990);
    Person gityee = new Person("Gityee", 1993);

    @Test
    public void testAdd() {
        //Given:
        List<String> arrayList = new ArrayList<>();

        //When:
        arrayList.add("Hello World");

        //Then:
        Assert.assertTrue(arrayList.get(0).equals("Hello World"));
    }

    @Test
    public void testIndexAdd() {
        //Given:
        personList.add(xiong);
        personList.add(gityee);
        Person mike = new Person("Mike", 1992);

        //When:
        personList.add(0, mike);

        //Then:
        Assert.assertSame(personList.get(0), mike);
    }

    @Test
    public void testAddAll() {
        //Given:
        Person[] personArray = new Person[] {xiong, gityee};

        //When:
        personList.addAll(Arrays.asList(personArray));

        //Then:
        Assert.assertTrue(personList.size() == 2);
    }

    @Test
    public void testAddAllIndex() {
        //Given:
        personList.add(xiong);
        personList.add(gityee);
        Person[] personArray = new Person[] {xiong, gityee};

        //When:
        personList.addAll(1, Arrays.asList(personArray));
        Person expected = xiong;
        Person actual = personList.get(1);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testClear() {
        //Given:
        personList.add(xiong);
        personList.add(gityee);

        //When:
        personList.clear();

        //Then:
        Assert.assertTrue(personList.isEmpty());
    }

    @Test
    public void testContains() {
        //Given:
        personList.add(xiong);
        personList.add(gityee);

        //When:
        boolean expected = true;
        boolean actual = personList.contains(gityee);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet() {
        //Given:
        personList.add(xiong);
        personList.add(gityee);

        //When:
        String expected = "Xiong";
        String actual = personList.get(0).getName();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIndexOf() {
        //Given:
        personList.add(xiong);
        personList.add(gityee);

        //When:
        int expected = 1;
        int actual = personList.indexOf(gityee);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        //Given:
        personList.add(xiong);
        personList.add(gityee);

        //When:
        personList.remove(xiong);

        //Then:
        Assert.assertFalse(personList.contains(xiong));
    }

    @Test
    public void testRemoveAll() {
        //Given:
        personList.add(xiong);
        personList.add(gityee);
        Person[] personArray = new Person[] {xiong, gityee};

        //When:
        personList.removeAll(Arrays.asList(personArray));

        //Then:
        Assert.assertTrue(personList.isEmpty());
    }

    @Test
    public void testSize() {
        //Given:
        personList.add(xiong);
        personList.add(gityee);

        //When:
        int expected = 2;
        int actual = personList.size();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSet() {
        //Given:
        personList.add(xiong);
        personList.add(gityee);

        //When:
        personList.set(1, xiong);

        //Then:
        Assert.assertSame(personList.get(1), xiong);
    }

}
