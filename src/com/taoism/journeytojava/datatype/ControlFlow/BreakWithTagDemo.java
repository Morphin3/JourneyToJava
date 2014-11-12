package com.taoism.journeytojava.datatype.ControlFlow;

import java.util.Scanner;

/**
 * Created by chenfei on 14-11-12.
 */
public class BreakWithTagDemo {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int m = 0;
		int sum = 0;
		int count = 0;
		read_data:
		while (count < 3) {
			for (int i = 0; i < 10; i++) {
				System.out.print("Enter a number >=0:");
				m = scanner.nextInt();
				if (m < 0) {
					break read_data;
				}
				sum += i;
			}
			count++;
		}

		if (m < 0) {
			System.out.println("输入的数小于0，已跳出循环,Sum=" + sum);

		} else {
			if (count == 3) {
				System.out.println("顺利执行完外层循环,Sum="+sum);
			}
		}
		System.out.println("执行了 " + count + " 次for循环");
	}
}

