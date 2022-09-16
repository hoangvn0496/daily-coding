package com.learning.service.impl;

public class SuperClass {

    public static int a  = 10;
    public static void honk() {                    // Vehicle method
        System.out.println("SuperClass, tuut!");
    }
    
   public Object produce(String input) {
        Object result = input.toLowerCase();
        return result;
    }
   
   public void abc() {
       
   }
}
