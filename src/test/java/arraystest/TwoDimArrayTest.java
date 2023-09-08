package arraystest;

import com.dsa.arrays.twodimarrays.SumOfZeroes;
import com.dsa.arrays.twodimarrays.SymmetricMatrix;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDimArrayTest
{
    @Test
    public void testMatrixCoverage() {
        // Test cases

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(2,2)),
                        new ArrayList<>(Arrays.asList(1,0)),
                        new ArrayList<>(Arrays.asList(0,1))
                )
        );
        Assert.assertEquals(SumOfZeroes.coverageOfMatrix(matrix), 4);


        ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(1, 0, 1)),
                        new ArrayList<>(Arrays.asList(0, 0, 1)),
                        new ArrayList<>(Arrays.asList(1, 1, 1))
                )
        );
        Assert.assertEquals(SumOfZeroes.coverageOfMatrix(matrix1), 6);

        ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(0, 1, 0, 0)),
                        new ArrayList<>(Arrays.asList(0, 0, 1, 0)),
                        new ArrayList<>(Arrays.asList(1, 1, 0, 0))
                )
        );
        Assert.assertEquals(SumOfZeroes.coverageOfMatrix(matrix2), 10);
    }

    @Test
    public void symmetricMatrix()
    {
        int[][] symmetricMatrix1 = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };

// Symmetric matrix with size 4x4
        int[][] symmetricMatrix2 = {
                {1, 2, 3, 4},
                {2, 5, 6, 7},
                {3, 6, 8, 9},
                {4, 7, 9, 10}
        };

// Symmetric matrix with size 2x2
        int[][] symmetricMatrix3 = {
                {11, 21},
                {21, 31}
        };

// Symmetric matrix with size 5x5
        int[][] symmetricMatrix4 = {
                {1, 0, 3, 0, 5},
                {0, 2, 0, 4, 0},
                {3, 0, 6, 0, 7},
                {0, 4, 0, 8, 0},
                {5, 0, 7, 0, 9}
        };
        Assert.assertEquals(SymmetricMatrix.isMatrixSymmetric(symmetricMatrix1), true);
        Assert.assertEquals(SymmetricMatrix.isMatrixSymmetric(symmetricMatrix2), true);
        Assert.assertEquals(SymmetricMatrix.isMatrixSymmetric(symmetricMatrix3), true);
        Assert.assertEquals(SymmetricMatrix.isMatrixSymmetric(symmetricMatrix4), true);


        // Non-symmetric matrix with size 3x3
        int[][] nonSymmetricMatrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

// Non-symmetric matrix with size 4x4
        int[][] nonSymmetricMatrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

// Non-symmetric matrix with size 2x2
        int[][] nonSymmetricMatrix3 = {
                {11, 12},
                {21, 22}
        };

// Non-symmetric matrix with size 5x5
        int[][] nonSymmetricMatrix4 = {
                {1, 2, 3, 4, 5},
                {0, 6, 7, 8, 9},
                {10, 0, 11, 12, 13},
                {14, 15, 0, 16, 17},
                {18, 19, 20, 21, 22}
        };

        Assert.assertEquals(SymmetricMatrix.isMatrixSymmetric(nonSymmetricMatrix1), false);
        Assert.assertEquals(SymmetricMatrix.isMatrixSymmetric(nonSymmetricMatrix2), false);
        Assert.assertEquals(SymmetricMatrix.isMatrixSymmetric(nonSymmetricMatrix3), false);
        Assert.assertEquals(SymmetricMatrix.isMatrixSymmetric(nonSymmetricMatrix4), false);
    }
}
