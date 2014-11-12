package com.taoism.journeytojava.datatype.controlflow;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by chenfei on 14-11-12.
 */
public class ForeachAndArrayDemo {

	public static void main(String[] args) {

		User user = new User();
		user.name = "陶喆";
		user.age = 40;

		ArrayList<User> userArrayList = new ArrayList<User>();
		userArrayList.add(user);
		userArrayList.add(user);
		userArrayList.add(user);
		userArrayList.add(user);


		String[] strings = new String[3];
		strings[0] = "陶喆";
		strings[1] = "王力宏";
		strings[2] = "周杰伦";

		int[] ints = new int[3];
		ints[0] = 1;
		ints[1] = 2;
		ints[2] = 3;


		System.out.println(Arrays.toString(strings));
		System.out.println(Arrays.toString(ints));


		for (String s : strings) {
			System.out.println(s);
		}

		for (int i : ints) {
			System.out.println(i);
		}

		String[] strings1 = new String[]{"哈哈", "呵呵", "嘿嘿"};
		System.out.println(Arrays.toString(strings1));

		int[] smallPrimes = {1, 2, 3, 4, 5, 6};

		smallPrimes = new int[]{6, 5, 4, 3, 2, 1};
		System.out.println(Arrays.toString(smallPrimes));

		int[] emptyints = new int[0];
		System.out.println(Arrays.toString(emptyints));
		System.out.println(emptyints.length);


		int[] luckyNumbers = smallPrimes;
		luckyNumbers[0] = 7;
		System.out.println(Arrays.toString(smallPrimes));
		System.out.println(Arrays.toString(luckyNumbers));

		int[] coppiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
		coppiedLuckyNumbers[0] = 1;
		System.out.println(Arrays.toString(luckyNumbers));
		System.out.println(Arrays.toString(coppiedLuckyNumbers));

		int[] coppiedLuckyNumbers1 = Arrays.copyOf(luckyNumbers, luckyNumbers.length * 2);
		int[] coppiedLuckyNumbers2 = Arrays.copyOf(luckyNumbers, luckyNumbers.length - 3);

		System.out.println(Arrays.toString(coppiedLuckyNumbers1));
		System.out.println(Arrays.toString(coppiedLuckyNumbers2));

		luckyNumbers=new int[]{1001,1002,1003,1004,1005,1006,1007};
		System.arraycopy(smallPrimes,2,luckyNumbers,3,4);
		System.out.println(Arrays.toString(luckyNumbers));


	}


	static class User {
		public String name;
		public int age;
	}

}
