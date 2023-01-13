package stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinStackTest {

    @Test
    public void testPush() {
        MinStack minStack = new MinStack();

        minStack.push(1);
        minStack.push(1);

        assertEquals(minStack.size(), 2);
    }

    @Test
    public void testPop() {
        MinStack minStack = new MinStack();

        minStack.push(1);
        minStack.push(1);
        minStack.pop();

        assertEquals(minStack.size(), 1);
    }

    @Test
    public void testTop() {
        MinStack minStack = new MinStack();

        minStack.push(1);
        minStack.push(2);

        assertEquals(minStack.top(), 2);
    }

    @Test
    public void testGetMin() {
        MinStack minStack = new MinStack();

        minStack.push(1);
        minStack.push(2);

        assertEquals(minStack.getMin(), 1);
    }
}
