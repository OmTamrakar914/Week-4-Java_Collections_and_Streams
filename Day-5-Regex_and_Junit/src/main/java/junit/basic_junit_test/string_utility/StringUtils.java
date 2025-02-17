package junit.basic_junit_test.string_utility;

import java.util.Scanner;

public class StringUtils {

    public static String reverse(String str){
        StringBuilder rev=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
             rev.insert(0,c);
        }
        return rev.toString();
    }

    public static boolean isPalindrome(String str){
        int n=str.length()-1;
        int i=0;
        while(i<n){
            if(str.charAt(i)!=str.charAt(n)){
                return false;
            }
            i++;
            n--;
        }
        return true;
    }

    public static String toUpperCase(String str){
        StringBuilder upp=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>='a'&&c<='z'){
                c=(char)(c-32);
                upp.append(c);
            }
            else{
                upp.append(c);
            }
        }
        return upp.toString();
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the String:");
        String str=scn.nextLine();

        System.out.println("Original String :" + str);
        System.out.println("Reverse String  :" + StringUtils.reverse(str));
        System.out.println("Is Palindrome   :" + StringUtils.isPalindrome(str));
        System.out.println("to uppercase    :" + StringUtils.toUpperCase(str));
    }
}
