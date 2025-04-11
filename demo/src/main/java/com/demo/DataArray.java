package com.demo;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//class Counter{
//	static int count = 0;
//	
//	Counter() {
//		count++;
//	}
//	void displayCounter() {
//		System.out.println("Count "+ count);
//	}
//}
 public class DataArray {
      public static void main(String[] args) {
//  Counter c1 = new Counter();
//  c1.displayCounter();
//  
//  Counter c2 = new Counter();
//  c2.displayCounter();
//  
//  
//  Counter c3 = new Counter();
//  c3.displayCounter();
//  
// 
    	  
    	  Set<Integer> x = new HashSet<>();
    	  x.add(10);
    	  x.add(8);
    	  x.add(45);
    	  Set<Integer> y = new HashSet<>();
    	  y.add(10);
    	  y.add(8);
    	  
    	  System.out.println(x.containsAll(y));
    	  
    	  System.out.println(new Random().nextInt(3, 9000));
	}
}

