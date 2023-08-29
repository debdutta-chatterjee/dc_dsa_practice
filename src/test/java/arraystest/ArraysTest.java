package arraystest;

import com.dsa.arrays.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

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

    @Test
    public void rotateArrayByK()
    {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        RotateArrayByK.rotate(arr,3);
        Assert.assertTrue(
                Arrays.equals(new int[]{5,6,7,1,2,3,4},arr)
        );

        arr = new int[]{-1,-100,3,99};
        RotateArrayByK.rotate(arr,2);
        Assert.assertTrue(
                Arrays.equals(new int[]{3,99,-1,-100},arr)
        );
    }

    @Test
    public void nonDecreasingArray()
    {
        int[] arr = new int[]{8,4,6};
        Assert.assertEquals(
                NonDecreasingArray.isPossible(arr,arr.length),true
                );
        arr = new int[]{3,4,2,5};
        Assert.assertEquals(
                NonDecreasingArray.isPossible(arr,arr.length),true
        );
    }

    @Test
    public void equilibriumIndex() {
        int[] arr = new int[]{1, 7, 3, 6, 5, 6};
        Assert.assertEquals(
                EquilibriumIndex.arrayEquilibriumIndex(arr), 3
        );

        arr = new int[]{1, 2, 3, 4};
        Assert.assertEquals(
                EquilibriumIndex.arrayEquilibriumIndex(arr), -1
        );
    }

    @Test
    public void firstMissingPositive()
    {
        int[] arr = new int[]{3, 2, -6, 1, 0};
        Assert.assertEquals(
                FirstMissingPositive.firstMissing(arr,arr.length), 4
        );

        arr = new int[]{7, 8, 9, 11, 12};
        Assert.assertEquals(
                FirstMissingPositive.firstMissing(arr,arr.length), 1
        );
    }
}
