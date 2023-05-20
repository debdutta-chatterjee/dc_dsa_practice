import com.dsa.linkedlist.SingleLinkedList;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LLTest
{
    SingleLinkedList linkedList;

    @BeforeTest
    public void setupTest()
    {
        //Create Linked list
        linkedList = new SingleLinkedList(1);
    }

    @Test
    public void constructorTest()
    {
        linkedList = new SingleLinkedList(55);
        Assert.assertEquals(linkedList.getLength(),1);
        Assert.assertEquals(linkedList.getHead().data,55);
        Assert.assertEquals(linkedList.getTail().data,55);
        linkedList.printAll();
    }

    @Test
    public void addNodeTest()
    {
        linkedList = new SingleLinkedList(55);
        linkedList.append(70);
        Assert.assertEquals(linkedList.getLength(),2);
        Assert.assertEquals(linkedList.getHead().data,55);
        Assert.assertEquals(linkedList.getTail().data,70);
        linkedList.printAll();

        linkedList.makeEmpty();
        linkedList.append(66);
        Assert.assertEquals(linkedList.getLength(),1);
        Assert.assertEquals(linkedList.getHead().data,66);
        Assert.assertEquals(linkedList.getTail().data,66);
        linkedList.printAll();
    }

    @Test
    public void removeLastNode()
    {
        linkedList = new SingleLinkedList(10);
        linkedList.append(20);
        linkedList.append(30);

        Assert.assertEquals(linkedList.removeLast().data,30);
        Assert.assertEquals(linkedList.getLength(),2);

        Assert.assertEquals(20, linkedList.removeLast().data,20);
        Assert.assertEquals(1, linkedList.getLength(),1);

        Assert.assertEquals(linkedList.removeLast().data,10);
        Assert.assertEquals(linkedList.getLength(),0);

        Assert.assertEquals(linkedList.removeLast(),null);
        Assert.assertEquals(linkedList.getLength(),0);
    }

    @Test
    public void prependNode()
    {
        linkedList = new SingleLinkedList(10);
        linkedList.removeLast();

        Assert.assertEquals(linkedList.getLength(),0);
        Assert.assertEquals(linkedList.getHead(),null);
        Assert.assertEquals(linkedList.getTail(),null);

        linkedList.prepend(1);
        Assert.assertEquals(linkedList.getLength(),1);
        Assert.assertEquals(linkedList.getHead().data,1);
        Assert.assertEquals(linkedList.getTail().data,1);

        linkedList.prepend(10);
        Assert.assertEquals(linkedList.getLength(),20);
        Assert.assertEquals(linkedList.getHead().data,10);
        Assert.assertEquals(linkedList.getTail().data,1);

        linkedList.prepend(20);
        Assert.assertEquals(linkedList.getLength(),3);
        Assert.assertEquals(linkedList.getHead().data,20);
        Assert.assertEquals(linkedList.getTail().data,1);
    }

    @Test
    public void removeFirst()
    {
        linkedList = new SingleLinkedList(10);

        Assert.assertEquals(linkedList.removeFirst().data,10);
        Assert.assertEquals(linkedList.getLength(),0);
        Assert.assertEquals(linkedList.getHead(),null);
        Assert.assertEquals(linkedList.getTail(),null);

        Assert.assertEquals(linkedList.removeFirst(),null);
        Assert.assertEquals(linkedList.getLength(),0);
        Assert.assertEquals(linkedList.getHead(),null);
        Assert.assertEquals(linkedList.getTail(),null);

        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(30);
        Assert.assertEquals(linkedList.removeFirst().data,10);
        Assert.assertEquals(linkedList.getLength(),3);
        Assert.assertEquals(linkedList.getHead().data,20);
        Assert.assertEquals(linkedList.getTail().data,30);
    }

    @Test
    public void getByIndex()
    {
        linkedList = new SingleLinkedList(0);
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);
        linkedList.append(50);
        Assert.assertEquals(linkedList.get(0).data,0);
        Assert.assertEquals(linkedList.get(-1),null);
        Assert.assertEquals(linkedList.get(linkedList.getLength()),null);
        Assert.assertEquals(linkedList.get(linkedList.getLength()+1),null);
        Assert.assertEquals(linkedList.get(1).data,10);
        Assert.assertEquals(linkedList.get(2).data,20);
        Assert.assertEquals(linkedList.get(3).data,30);
        Assert.assertEquals(linkedList.get(4).data,40);
        Assert.assertEquals(linkedList.get(5).data,50);
    }

    @Test
    public void setByIndex()
    {
        linkedList = new SingleLinkedList(0);
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);
        linkedList.append(50);
        Assert.assertEquals(linkedList.set(0,1),true);
        Assert.assertEquals(linkedList.get(0).data,1);

        Assert.assertEquals(linkedList.set(-1,99),false);
        Assert.assertEquals(linkedList.set(linkedList.getLength(),99),false);
        Assert.assertEquals(linkedList.set(linkedList.getLength()+1,1),false);

        Assert.assertEquals(linkedList.set(4,98),true);
        Assert.assertEquals(linkedList.set(5,97),true);
        Assert.assertEquals(linkedList.get(4).data,98);
        Assert.assertEquals(linkedList.get(5).data,97);
    }

    @Test
    public void insert()
    {
        linkedList = new SingleLinkedList(1);
        linkedList.append(3);
        Assert.assertEquals(linkedList.get(0).data,1);
        Assert.assertEquals(linkedList.get(1).data,3);
        Assert.assertEquals(linkedList.get(2),null);

        linkedList.insert(1, 2);
        Assert.assertEquals(linkedList.get(0).data,1);
        Assert.assertEquals(linkedList.get(1).data,2);
        Assert.assertEquals(linkedList.get(2).data,3);
        Assert.assertEquals(linkedList.get(3),null);

        linkedList.insert(0, 0);
        Assert.assertEquals(linkedList.get(0).data,0);
        Assert.assertEquals(linkedList.get(1).data,1);
        Assert.assertEquals(linkedList.get(2).data,2);
        Assert.assertEquals(linkedList.get(3).data,3);
        Assert.assertEquals(linkedList.get(4),null);

        linkedList.insert(4, 4);
        Assert.assertEquals(linkedList.get(0).data,0);
        Assert.assertEquals(linkedList.get(1).data,1);
        Assert.assertEquals(linkedList.get(2).data,2);
        Assert.assertEquals(linkedList.get(3).data,3);
        Assert.assertEquals(linkedList.get(4).data,4);
        Assert.assertEquals(linkedList.get(5),null);
    }

    @Test
    public void remove()
    {
        linkedList = new SingleLinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        Assert.assertEquals(linkedList.get(0).data,1);
        Assert.assertEquals(linkedList.get(1).data,2);
        Assert.assertEquals(linkedList.get(2).data,3);
        Assert.assertEquals(linkedList.get(3).data,4);
        Assert.assertEquals(linkedList.get(4).data,5);
        Assert.assertEquals(linkedList.get(5),null);
        Assert.assertEquals(linkedList.getLength(),5);

        Assert.assertEquals(linkedList.remove(2).data,3);
        Assert.assertEquals(linkedList.get(0).data,1);
        Assert.assertEquals(linkedList.get(1).data,2);
        Assert.assertEquals(linkedList.get(2).data,4);
        Assert.assertEquals(linkedList.get(3).data,5);
        Assert.assertEquals(linkedList.get(4),null);
        Assert.assertEquals(linkedList.getLength(),4);

        Assert.assertEquals(linkedList.remove(0).data,1);
        Assert.assertEquals(linkedList.get(0).data,2);
        Assert.assertEquals(linkedList.get(1).data,4);
        Assert.assertEquals(linkedList.get(2).data,5);
        Assert.assertEquals(linkedList.get(3),null);
        Assert.assertEquals(linkedList.getLength(),3);

        Assert.assertEquals(linkedList.remove(2).data,5);
        Assert.assertEquals(linkedList.get(0).data,2);
        Assert.assertEquals(linkedList.get(1).data,4);
        Assert.assertEquals(linkedList.get(2),null);
        Assert.assertEquals(linkedList.getLength(),2);
    }

    @Test
    public void reverse()
    {
        linkedList = new SingleLinkedList(1);
        linkedList.reverse();
        Assert.assertEquals(linkedList.get(0).data,1);

        linkedList.removeFirst();
        linkedList.reverse();
        Assert.assertEquals(linkedList.get(0),null);

        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        int length = linkedList.getLength();
        linkedList.reverse();
        Assert.assertEquals(linkedList.getLength(),length);
        Assert.assertEquals(linkedList.get(0).data,5);
        Assert.assertEquals(linkedList.get(1).data,4);
        Assert.assertEquals(linkedList.get(2).data,3);
        Assert.assertEquals(linkedList.get(3).data,2);
        Assert.assertEquals(linkedList.get(4).data,1);
    }

    @Test
    public void findMiddleNode()
    {
        //Single element
        linkedList = new SingleLinkedList(1);
        Assert.assertEquals(linkedList.findMiddleNode().data,1);

        //empty list
        linkedList.makeEmpty();
        Assert.assertEquals(linkedList.findMiddleNode(),null);

        //Multiple elements
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        Assert.assertEquals(linkedList.findMiddleNode().data,3);

        linkedList.append(6);
        Assert.assertEquals(linkedList.findMiddleNode().data,3);
    }

    @Test
    public void findKthNode()
    {
        linkedList = new SingleLinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        Assert.assertEquals(linkedList.findKthFromEnd(2).data,4);
        Assert.assertEquals(linkedList.findKthFromEnd(1).data,5);
        Assert.assertEquals(linkedList.findKthFromEnd(0),null);
        Assert.assertEquals(linkedList.findKthFromEnd(4).data,2);
        Assert.assertEquals(linkedList.findKthFromEnd(6),null);
    }

    @Test
    public void hasLoop()
    {
        linkedList = new SingleLinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        Assert.assertEquals(linkedList.hasLoop(),false);

        linkedList.getTail().next = linkedList.getHead().next;
        Assert.assertEquals(linkedList.hasLoop(),true);
    }
}
