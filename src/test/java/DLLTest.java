import com.dsa.linkedlist.DoubleLinkedList;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DLLTest
{
    DoubleLinkedList linkedList;

    @BeforeTest
    public void setupTest()
    {
        //Create Linked list
        linkedList = new DoubleLinkedList(1);
    }

    @Test
    public void constructorTest()
    {
        linkedList = new DoubleLinkedList(55);
        Assert.assertEquals(linkedList.getLength(),1);
        Assert.assertEquals(linkedList.getHead().value,55);
        Assert.assertEquals(linkedList.getTail().value,55);
        linkedList.printAll();
    }

    @Test
    public void addNodeTest()
    {
        linkedList = new DoubleLinkedList(55);
        linkedList.append(70);
        Assert.assertEquals(linkedList.getLength(),2);
        Assert.assertEquals(linkedList.getHead().value,55);
        Assert.assertEquals(linkedList.getTail().value,70);
        linkedList.printAll();

        linkedList.makeEmpty();
        linkedList.append(66);
        Assert.assertEquals(linkedList.getLength(),1);
        Assert.assertEquals(linkedList.getHead().value,66);
        Assert.assertEquals(linkedList.getTail().value,66);
        linkedList.printAll();
    }

    @Test
    public void removeLastNode()
    {
        linkedList = new DoubleLinkedList(10);
        linkedList.append(20);
        linkedList.append(30);

        Assert.assertEquals(linkedList.removeLast().value,30);
        Assert.assertEquals(linkedList.getLength(),2);

        Assert.assertEquals(20, linkedList.removeLast().value,20);
        Assert.assertEquals(1, linkedList.getLength(),1);

        Assert.assertEquals(linkedList.removeLast().value,10);
        Assert.assertEquals(linkedList.getLength(),0);

        Assert.assertEquals(linkedList.removeLast(),null);
        Assert.assertEquals(linkedList.getLength(),0);
    }

    @Test
    public void prependNode()
    {
        linkedList = new DoubleLinkedList(10);
        linkedList.removeLast();

        Assert.assertEquals(linkedList.getLength(),0);
        Assert.assertEquals(linkedList.getHead(),null);
        Assert.assertEquals(linkedList.getTail(),null);

        linkedList.prepend(1);
        Assert.assertEquals(linkedList.getLength(),1);
        Assert.assertEquals(linkedList.getHead().value,1);
        Assert.assertEquals(linkedList.getTail().value,1);

        linkedList.prepend(10);
        Assert.assertEquals(linkedList.getLength(),2);
        Assert.assertEquals(linkedList.getHead().value,10);
        Assert.assertEquals(linkedList.getTail().value,1);

        linkedList.prepend(20);
        Assert.assertEquals(linkedList.getLength(),3);
        Assert.assertEquals(linkedList.getHead().value,20);
        Assert.assertEquals(linkedList.getTail().value,1);
    }

    @Test
    public void removeFirst()
    {
        linkedList = new DoubleLinkedList(10);

        Assert.assertEquals(linkedList.removeFirst().value,10);
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
        Assert.assertEquals(linkedList.removeFirst().value,10);
        Assert.assertEquals(linkedList.getLength(),3);
        Assert.assertEquals(linkedList.getHead().value,20);
        Assert.assertEquals(linkedList.getTail().value,30);
    }

    @Test
    public void getByIndex()
    {
        linkedList = new DoubleLinkedList(0);
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);
        linkedList.append(50);
        Assert.assertEquals(linkedList.get(0).value,0);
        Assert.assertEquals(linkedList.get(-1),null);
        Assert.assertEquals(linkedList.get(linkedList.getLength()),null);
        Assert.assertEquals(linkedList.get(linkedList.getLength()+1),null);
        Assert.assertEquals(linkedList.get(1).value,10);
        Assert.assertEquals(linkedList.get(2).value,20);
        Assert.assertEquals(linkedList.get(3).value,30);
        Assert.assertEquals(linkedList.get(4).value,40);
        Assert.assertEquals(linkedList.get(5).value,50);
    }

    @Test
    public void setByIndex()
    {
        linkedList = new DoubleLinkedList(0);
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);
        linkedList.append(50);
        Assert.assertEquals(linkedList.set(0,1),true);
        Assert.assertEquals(linkedList.get(0).value,1);

        Assert.assertEquals(linkedList.set(-1,99),false);
        Assert.assertEquals(linkedList.set(linkedList.getLength(),99),false);
        Assert.assertEquals(linkedList.set(linkedList.getLength()+1,1),false);

        Assert.assertEquals(linkedList.set(4,98),true);
        Assert.assertEquals(linkedList.set(5,97),true);
        Assert.assertEquals(linkedList.get(4).value,98);
        Assert.assertEquals(linkedList.get(5).value,97);
    }

    @Test
    public void insert()
    {
        linkedList = new DoubleLinkedList(1);
        linkedList.append(3);
        Assert.assertEquals(linkedList.get(0).value,1);
        Assert.assertEquals(linkedList.get(1).value,3);
        Assert.assertEquals(linkedList.get(2),null);

        linkedList.insert(1, 2);
        Assert.assertEquals(linkedList.get(0).value,1);
        Assert.assertEquals(linkedList.get(1).value,2);
        Assert.assertEquals(linkedList.get(2).value,3);
        Assert.assertEquals(linkedList.get(3),null);

        linkedList.insert(0, 0);
        Assert.assertEquals(linkedList.get(0).value,0);
        Assert.assertEquals(linkedList.get(1).value,1);
        Assert.assertEquals(linkedList.get(2).value,2);
        Assert.assertEquals(linkedList.get(3).value,3);
        Assert.assertEquals(linkedList.get(4),null);

        linkedList.insert(4, 4);
        Assert.assertEquals(linkedList.get(0).value,0);
        Assert.assertEquals(linkedList.get(1).value,1);
        Assert.assertEquals(linkedList.get(2).value,2);
        Assert.assertEquals(linkedList.get(3).value,3);
        Assert.assertEquals(linkedList.get(4).value,4);
        Assert.assertEquals(linkedList.get(5),null);
    }

    @Test
    public void remove()
    {
        linkedList = new DoubleLinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        Assert.assertEquals(linkedList.get(0).value,1);
        Assert.assertEquals(linkedList.get(1).value,2);
        Assert.assertEquals(linkedList.get(2).value,3);
        Assert.assertEquals(linkedList.get(3).value,4);
        Assert.assertEquals(linkedList.get(4).value,5);
        Assert.assertEquals(linkedList.get(5),null);
        Assert.assertEquals(linkedList.getLength(),5);

        Assert.assertEquals(linkedList.remove(2).value,3);
        Assert.assertEquals(linkedList.get(0).value,1);
        Assert.assertEquals(linkedList.get(1).value,2);
        Assert.assertEquals(linkedList.get(2).value,4);
        Assert.assertEquals(linkedList.get(3).value,5);
        Assert.assertEquals(linkedList.get(4),null);
        Assert.assertEquals(linkedList.getLength(),4);

        Assert.assertEquals(linkedList.remove(0).value,1);
        Assert.assertEquals(linkedList.get(0).value,2);
        Assert.assertEquals(linkedList.get(1).value,4);
        Assert.assertEquals(linkedList.get(2).value,5);
        Assert.assertEquals(linkedList.get(3),null);
        Assert.assertEquals(linkedList.getLength(),3);

        Assert.assertEquals(linkedList.remove(2).value,5);
        Assert.assertEquals(linkedList.get(0).value,2);
        Assert.assertEquals(linkedList.get(1).value,4);
        Assert.assertEquals(linkedList.get(2),null);
        Assert.assertEquals(linkedList.getLength(),2);
    }

}
