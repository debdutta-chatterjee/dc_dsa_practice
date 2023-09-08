package com.dsa.strings;

public class BeautifulString
{
//    public static int makeBeautiful(String str) {
//
//        int countodd=0;
//        if(str.length()==1) return count;
//        char[] c = str.toCharArray();
//        for(int i =1;i<c.length;i++)
//        {
//            //System.out.println((int)c[i]);
//            // System.out.println((int)c[i]+c[i-1]);
//
//            if(c[i]+c[i-1] == 97) continue;
//            else if (c[i-1]+c[i]==98)
//                c[i]=48;
//            else c[i] = 49;
//            count++;
//
//        }
//        return count;
//    }

    public static int makeBeautiful(String str) {

        int count1=0;
        int count2=0;

        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
            {
                if(str.charAt(i)=='0') count1++;
                if(str.charAt(i)=='1') count2++;
            }
            else
            {
                if(str.charAt(i)=='0') count2++;
                if(str.charAt(i)=='1') count1++;
            }
        }
        return count1<count2? count1:count2;
    }
}
