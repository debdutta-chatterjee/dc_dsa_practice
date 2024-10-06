package com.sdet.practice;

public class Palindrome
{
    public static void main(String[] a)
    {
        System.out.println(isPalindrome(123321));
        System.out.println(isPalindrome(1001001));
        System.out.println(isPalindrome(12321));

        System.out.println(isPalindrome(123021));
        System.out.println(isPalindrome(12331));


        System.out.println(isPalindromeAlternative(123321));
        System.out.println(isPalindromeAlternative(1001001));
        System.out.println(isPalindromeAlternative(12321));

        System.out.println(isPalindromeAlternative(123021));
        System.out.println(isPalindromeAlternative(12331));

    }
    public static boolean isPalindrome(int num)
    {
        int temp =num;
        int reverse=0;

        while(temp!=0)
        {
            reverse = (reverse*10)+ (temp%10);
            temp=temp/10;
        }

        return reverse == num;
    }

    public static boolean isPalindromeAlternative(int num)
    {
        String strNum = String.valueOf(num);

        for(int i=0;i<=strNum.length()/2;i++)
        {
            if(strNum.charAt(i)!= strNum.charAt(strNum.length()-1-i))
                return false;
        }
        return true;
    }
}
