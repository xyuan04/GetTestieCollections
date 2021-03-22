package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {
    Stack<Person> personStack = new Stack<>();
    Stack<Address> addressStack = new Stack<>();
    Person xiong = new Person("Xiong", 1990);
    Person gityee = new Person("Gityee", 1993);
    Address home = new Address("111 Real St", "Philadelphia", "00001", "USA");

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void testIsEmptyTrue() {
        //Given:
        Stack<String> stack = new Stack<>();

        //When:
        boolean expected = true;
        boolean actual = stack.isEmpty();

        //Then:
        assertEquals(expected, actual);
    }

    @Test
    public void testIsEmptyFalse() {
        //Given:
        personStack.add(xiong);

        //When:
        boolean expected = false;
        boolean actual = personStack.isEmpty();

        //Then:
        assertEquals(expected, actual);
    }


    @Test
    public void testAdd() {
        //Given:
        personStack.add(xiong);
        personStack.add(gityee);

        //When:
        int expected = 2;
        int actual = personStack.size();

        //Then:
        assertEquals(expected, actual);
    }

    @Test
    public void testPeak() {
        //Given:
        personStack.add(xiong);
        personStack.add(gityee);

        //When:
        Person expected = gityee;
        Person actual = personStack.peek();

        //Then:
        assertEquals(expected, actual);
    }

    @Test
    public void testPush() {
        //Given:
        personStack.add(xiong);

        //When:
        personStack.push(gityee);
        Person expected = gityee;
        Person actual = personStack.peek();

        //Then:
        assertEquals(expected, actual);
    }

    @Test
    public void testPop() {
        //Given:
        personStack.add(xiong);
        personStack.push(gityee);

        //When:
        Person expected = gityee;
        Person actual = personStack.pop();

        //Then:
        assertEquals(expected, actual);
    }

    @Test
    public void testPopSize() {
        //Given:
        personStack.add(xiong);
        personStack.push(gityee);

        //When:
        personStack.pop();
        int expected = 1;
        int actual = personStack.size();

        //Then:
        assertEquals(expected, actual);
    }

    @Test
    public void testSearch() {
        //Given:
        personStack.add(xiong);
        personStack.push(gityee);

        //When:
        int expected = 2;
        int actual = personStack.search(xiong);

        //Then:
        assertEquals(expected, actual);
    }
}
