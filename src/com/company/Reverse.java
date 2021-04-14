package com.company;

//P. Nikhil Sai
//20MIS7015

import java.util.*;
class Reverse {
    public static String ReverseString(String str) {

        char[] reverseString = new char[str.length()];

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {

            stack.push(str.charAt(i));
        }
        int i = 0;

        while (!stack.isEmpty()) {

            reverseString[i++] = stack.pop();

        }
        return new String(reverseString);
    }
    public static void main(String[] args) {
        System.out.println("enter the input to reverse");
        Scanner sc=new Scanner(System.in);

        String str = sc.nextLine();
        //System.out.println(str + " ");

        System.out.println("String after reversal");
        System.out.println("" + ReverseString(str));
    }
}