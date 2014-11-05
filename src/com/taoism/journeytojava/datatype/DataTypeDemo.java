package com.taoism.journeytojava.datatype;

public class DataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isNaNTest();
	}
	
	private static void  isNaNTest(){
		System.out.println(3==Double.NaN);
		
		double x=0;
		double y=0;
		System.out.println(Double.isNaN(x/y));
	}

}
