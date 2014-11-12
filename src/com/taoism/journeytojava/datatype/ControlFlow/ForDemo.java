package com.taoism.journeytojava.datatype.controlflow;

import java.util.Scanner;

/**
 * Created by chenfei on 14-11-12.
 */
public class ForDemo {

	public static void main(String[] args) {
		for (int i = 10; i > 0; i--)
			System.out.println("Counting down..." + i);
		System.out.println("Blastoff!");


		for (double x = 0; x != 10; x += 0.1) {
			System.out.println(x);
			if (x > 1000)
				break;
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers do you need to draw?");
		int k = scanner.nextInt();

		System.out.println("What is the highest number you can draw?");
		int n = scanner.nextInt();

		int lotteryOdds = 1;
		for (int i = 1; i <= k; i++) {
			lotteryOdds = lotteryOdds * (n - i + 1) / i;
		}
		System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");

	}
}
