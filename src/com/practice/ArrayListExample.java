package com.practice;

import java.util.ArrayList;


public class ArrayListExample {
	
	public static void main(String args[]) {
	      /*Creation of ArrayList: I'm going to add String
	       *elements so I made it of string type */
		  ArrayList<String> obj = new ArrayList<String>();

		  /*This is how elements should be added to the array list*/
		  obj.add("Ajeeti");
		  obj.add("Harry");
		  obj.add("Chaitanyai");
		  obj.add("Steve");
		  obj.add("Anuj");

		  obj.add("deepak");
		  /* Displaying array list elements */
		  System.out.println("Currently the array list has following elements:"+obj);

		  /*Add element at the given index*/
		  obj.add(0, "Rahul");
		  obj.add(1, "Justin");

		  /*Remove elements from array list like this*/
		  obj.remove("Chaitanya");
		  obj.remove("Harry");

		  System.out.println("Current array list is:"+obj);

		  /*Remove element from the given index*/
		  obj.remove(1);

		  System.out.println("Current array list is:"+obj);
		  
		  //finding out index position of particular element
		  
		  int pos = obj.indexOf("Steve");
		  
		  System.out.println("Index Position of element:" +pos);
		  
		  //getting element of particualar index positon: 
		  
		  String str =  obj.get(2);
		  
		  System.out.println("Element of particular index postion: " +str);
		  
		  // gives the size number of the elements in Arraylist
		  
		  int numberofelements =  obj.size();
		  
		  System.out.println("The sizeof the Arraylist:  "+ numberofelements);
		  
		  //checking wheather given object is present or not 
		  
		 boolean present =  obj.contains("steve");
		  System.out.println(present);
		  
	   }
	}


