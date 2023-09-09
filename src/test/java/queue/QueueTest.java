package queue;

import com.dsa.queue.Queue;
import com.dsa.stack.Stack;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QueueTest
{
    @Test
    public void queueConstructorTest()
    {
        Queue myQueue = new Queue(4);
        Assert.assertEquals(myQueue.getFirst().value,4);
        Assert.assertEquals(myQueue.getLast().value,4);
        Assert.assertNull(myQueue.getFirst().next);
        Assert.assertEquals(myQueue.getLength(),1);
    }

    @Test
    public void enqueueTest()
    {
        Queue myQueue = new Queue(4);
        Assert.assertEquals(myQueue.getFirst().value,4);
        Assert.assertEquals(myQueue.getLast().value,4);
        Assert.assertNull(myQueue.getFirst().next);
        Assert.assertEquals(myQueue.getLength(),1);

        myQueue.enqueue(1);
        Assert.assertEquals(myQueue.getFirst().value,4);
        Assert.assertEquals(myQueue.getLast().value,1);
        Assert.assertEquals(myQueue.getLength(),2);
    }

    @Test
    public void dequeueTest()
    {
        Queue myQueue = new Queue(2);
        myQueue.enqueue(1);
        Assert.assertEquals(myQueue.dequeue().value,2);
        Assert.assertEquals(myQueue.dequeue().value,1);
        Assert.assertEquals(myQueue.dequeue(),null);
    }
}
