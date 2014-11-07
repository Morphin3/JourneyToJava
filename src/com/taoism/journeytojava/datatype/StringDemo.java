package com.taoism.journeytojava.datatype;

/**
 * Created by chenfei on 14-11-7.
 */
public class StringDemo {

	public static void main(String[] args) {
		String greeting = "Hello";
		String s = greeting.substring(0, 3);
		System.out.println(s);
		greeting = greeting.subSequence(0, 3) + "p!";
		System.out.println(greeting);


		String greeting2 = "Hello";
		if (greeting2 == "Hello") {
			System.out.println("哈哈");
		}

		if (greeting2.substring(0, 3) == "Hel") {
			System.out.println("呵呵");
		}

		if (greeting2.substring(0, 3).compareTo("Hel") == 0) {
			System.out.println("compareTo 结果相等");
		}

		String greeting3 = "Hello";                                      //代码单元数量
		int n = greeting3.length();
		System.out.println(n);

		int cpCount = greeting3.codePointCount(0, greeting3.length());        //代码点数量
		System.out.println(cpCount);

		char first = greeting3.charAt(0);
		System.out.println(first);

		char last = greeting3.charAt(4);
		System.out.println(last);

		int index = greeting3.offsetByCodePoints(0, 3);
		int cp = greeting3.codePointAt(index);

		System.out.println(index);


		int i = 0;
		while (i < greeting3.length()) {
			int cp2 = greeting3.codePointAt(i);
			System.out.println("代码点" + cp2);
			if (Character.isSupplementaryCodePoint(cp2)) {
				i += 2;
			} else {
				i++;
			}
		}
		System.out.println(i);

		while (i > 0) {
			i--;
			int cp2 = greeting3.codePointAt(i);
			System.out.println(cp2);
			if (Character.isSupplementaryCodePoint(cp2)) {
				i--;
			}
		}


	}

}
