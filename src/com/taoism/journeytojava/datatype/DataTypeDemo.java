package com.taoism.journeytojava.datatype;

import com.sun.source.tree.IfTree;


public class DataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isNaNTest();
	}

	private static void isNaNTest() {
		System.out.println(3 == Double.NaN); // x==Double.NaN is Never True

		double x = 0;
		double y = 0;
		System.out.println(Double.isNaN(x / y));
		
		System.out.println("\u005B\u005D");
	}
    
	
	
}
