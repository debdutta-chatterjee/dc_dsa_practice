package stack;

import com.dsa.stack.Stack;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StackTest
{
    @Test
    public void stackConstructorTest()
    {
        Stack stack = new Stack(10);
        Assert.assertEquals(stack.getHeight(),1);
        Assert.assertEquals(stack.getTop().value,10);
        Assert.assertNull(stack.getTop().next);
    }

    @Test
    public void stackPushTest()
    {
        Stack stack = new Stack(10);
        stack.push(20);
        Assert.assertEquals(stack.getHeight(),2);
        Assert.assertEquals(stack.getTop().value,20);
        Assert.assertEquals(stack.getTop().next.value,10);
        Assert.assertNull(stack.getTop().next.next);
    }

    @Test
    public void stackPopTest()
    {
        Stack stack = new Stack(10);
        stack.push(20);
        Assert.assertEquals(stack.pop().value,20);
        Assert.assertEquals(stack.getHeight(),1);
        Assert.assertEquals(stack.getTop().value,10);

        Assert.assertEquals(stack.pop().value,10);
        Assert.assertEquals(stack.getHeight(),0);
        Assert.assertNull(stack.getTop());
    }
}
