package com.taoism.journeytojava.datatype;

/**
 * Created by chenfei on 14-11-7.
 */
public class Enum {
	enum Size {
		SMALL, MEDIUM, LARGE, EXTRA_LARGE
	}


	public static void main(String[] args) {
		Size s = Size.SMALL;
		System.out.println(s);

		s = Size.MEDIUM;
		System.out.println(s);

		s = Size.LARGE;
		System.out.println(s);

		s = Size.EXTRA_LARGE;
		System.out.println(s);

		s = null;
		System.out.println(s);

	}
}
