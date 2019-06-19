package com.demo.hello;

import java.util.ArrayList;

public class hello {
    public static void main1(){
        ArrayList l1 =new ArrayList();
        System.out.print("111");
    }
    public void method(){

    }

    public static void main(String[] args) {
        
        int num1=11;
        System.out.println(num1);
        System.out.println("num1 = " + num1);
        System.out.println("num1 = " + num1);
        String[] arr=new String[]{"zhang","shuai","feng"};
        //普通for循环fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

       //增强for循环iter
        for (String s : arr) {
            System.out.println(s);
        }

        //集合for循环Template
        ArrayList<String> list1=new ArrayList<String>();list1.add("zhang");

        list1.add("shuai");
        list1.add("feng");
        list1.add("Test");
        //list.for
        for (String s : list1) {
            System.out.println(s);
            for (String s1 : list1) {
                
            }
        }


    }

}





