package com.taoism.journeytojava.datatype;

import com.sun.source.tree.IfTree;


public class DataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isNaNTest();


		int n = 12;
		int fourthBitFromRight = (n & 8) / 8;
		System.out.println(fourthBitFromRight);

		System.out.println(Math.pow(2.1, 2.3));
		System.out.println(Math.sin(30));
		System.out.println(Math.sin(3.14 / 6));
		System.out.println(Math.cos(30));

		System.out.println(StrictMath.sin(3.14 / 6));

		double x = 9.997;
		int nx = (int) x;
		System.out.println(nx);
		nx = (int) Math.round(nx);
		System.out.println(nx);

	}

	private static void isNaNTest() {
		System.out.println(3 == Double.NaN); // x==Double.NaN is Never True

		double x = 0;
		double y = 0;
		System.out.println(Double.isNaN(x / y));

		System.out.println("\u005B\u005D");
	}


}
