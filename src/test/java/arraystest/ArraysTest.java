package arraystest;

import com.dsa.arrayandstrings.SecondLargestElementInArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraysTest
{
    @Test
    public void secondLargestElementInArray()
    {
        int[] arr = new int[]{10, 25 ,-12, -6, 20, 20 };
        Assert.assertEquals(SecondLargestElementInArray.findSecondLargest(arr.length,arr),
                20
        );

        arr = new int[]{-12, 14, -15, -17, 20 };
        Assert.assertEquals(SecondLargestElementInArray.findSecondLargest(arr.length,arr),
                14
        );

        arr = new int[]{-20, -30, 40, 25, 10};
        Assert.assertEquals(SecondLargestElementInArray.findSecondLargest(arr.length,arr),
                25
        );

        arr = new int[]{-58 ,62, -53, -61, -21 ,17};
        Assert.assertEquals(SecondLargestElementInArray.findSecondLargest(arr.length,arr),
                17
        );

        arr = new int[]{-17, -74, -35, 72, 41, -88};
        Assert.assertEquals(SecondLargestElementInArray.findSecondLargest(arr.length,arr),
                41
        );

        arr = new int[]{-10, -40, -25, -12, -25, -10};
        Assert.assertEquals(SecondLargestElementInArray.findSecondLargest(arr.length,arr),
                -12
        );

        arr = new int[]{-12, -10, -10, -6, -5,};
        Assert.assertEquals(SecondLargestElementInArray.findSecondLargest(arr.length,arr),
                -6
        );
    }
}
