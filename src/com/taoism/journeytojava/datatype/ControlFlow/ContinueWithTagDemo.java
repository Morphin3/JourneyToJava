package com.taoism.journeytojava.datatype.ControlFlow;

import java.util.Scanner;

/**
 * Created by chenfei on 14-11-12.
 */
public class ContinueWithTagDemo {
	public static void main(String[] args) {

//		int n = 0;
//		Scanner scanner = new Scanner(System.in);
//		int i = 0;
//		while (true) {
//			System.out.print("Enter a number:");
//			n = scanner.nextInt();
//			if (i < 10) {
//				i++;
//			}
//			continuepoint:
//
//			System.out.print("i已到10");
//			if (i < 20) {
//				i += 2;
//			}
//		}

		System.out.println("--------测试带标签的continue-------");
		lable1:
		for (int i = 1; i < 10; i++) {
			lable2:
			System.out.println("i = " + i);
			for (int j = 0; j < 10; j++) {
				if (j == 9)
					continue lable1;
			}
			System.out.println("哈哈");
		}

	}
}
