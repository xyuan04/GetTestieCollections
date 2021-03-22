package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    ArrayList<Person> personArrayList = new ArrayList<>();
    Person xiong = new Person("Xiong", 1990);
    Person gityee = new Person("Gityee", 1993);

    @Test
    public void hasNextTest() {
        //Given:
        personArrayList.add(xiong);
        personArrayList.add(gityee);

        //When:
        Iterator<Person> personIterator = personArrayList.iterator();


        //Then:
        Assert.assertTrue(personIterator.hasNext());
    }

    @Test
    public void nextTest() {
        //Given:
        personArrayList.add(xiong);
        personArrayList.add(gityee);

        //When:
        Iterator<Person> personIterator = personArrayList.iterator();
        Person nextPerson = personIterator.next();

        Then:
        Assert.assertEquals(xiong, nextPerson);
    }

    @Test
    public void removeTest() {
        //Given:
        personArrayList.add(xiong);
        personArrayList.add(gityee);

        //When:
        Iterator<Person> personIterator = personArrayList.iterator();
        while(personIterator.hasNext()) {
            if(personIterator.next() == xiong) {
                personIterator.remove();
            }
        }

        //Then:
        Assert.assertFalse(personArrayList.contains(xiong));
    }
}
