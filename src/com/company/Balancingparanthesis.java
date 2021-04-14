package com.company;

//P. Nikhil Sai
//20MIS7015

import java.util.*;
public class Balancingparanthesis {

    static char stack[]=new char[100];
    static int top,i;
    public static void main(String args[]){
        long start=System.currentTimeMillis();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string that ends with $");
        String str=sc.nextLine();
        top=-1;
        push('$');
        for( i=0;str.charAt(i)!='$';i++){
            if(str.charAt(i)=='{'){
                push(str.charAt(i));
            }
            else if(str.charAt(i)=='}' & stack[top]=='{'){
                pop();
            }
            else if(str.charAt(i)=='}'& stack[top]=='$'){
                break;
            }
        }
        if(str.charAt(i)=='$' & stack[top]=='$'){
            System.out.println("balanced paranthesis");
        }
        else{
            System.out.println("not a balanced paranthesis");
        }
        long end=System.currentTimeMillis();
        float sec=(end-start)/1000F;
        System.out.println(sec +"seconds");
    }

    public static void push(char ch){
        top++;
        stack[top]=ch;
        System.out.println("pushed"+" "+stack[top]);
    }
    public static void pop(){
        System.out.println("popped"+" "+stack[top]);
        top--;
    }

}