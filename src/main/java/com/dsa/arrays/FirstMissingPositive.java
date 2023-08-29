package com.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstMissingPositive
{
   //https://www.codingninjas.com/studio/problems/first-missing-positive_699946
    public static int firstMissing(int[] arr, int n) {

        Map<Integer,Boolean> map = new HashMap<>();
        int minMissingNum =1;
        for(int el: arr)
        {
            if(el<1) continue;
            map.put(el, true);
            if(el==minMissingNum)
            {
                while(map.containsKey(minMissingNum))minMissingNum++;
            }
        }
        return minMissingNum;
    }
}
