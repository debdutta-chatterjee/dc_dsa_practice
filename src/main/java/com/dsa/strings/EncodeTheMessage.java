package com.dsa.strings;

public class EncodeTheMessage
{
    public static String encode(String message) {

        int count=1;
        char[] arr = message.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]==arr[i])count++;
            else{
                sb.append(arr[i-1]);
                sb.append(count);
                count=1;
            }
        }
        sb.append(arr[arr.length-1]);
        sb.append(count);
        return sb.toString();
    }
}
