package com.dsa.arrays.twodimarrays;

import java.util.ArrayList;

public class SumOfZeroes
{
    public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {

        int count=0;

        for(int i=0;i<mat.size();i++)
        {
            for(int j=0;j<mat.get(0).size();j++)
            {
                if (mat.get(i).get(j)!=0)continue;

                //above
                if(i!=0 && mat.get(i-1).get(j)==1)count++;

                //below
                if(i<mat.size()-1 && mat.get(i+1).get(j)==1)count++;

                //right
                if(j!=0 && mat.get(i).get(j-1)==1)count++;

                //left
                if(j<mat.get(i).size()-1  && mat.get(i).get(j+1)==1)count++;
            }

        }
        return count;
    }
}
