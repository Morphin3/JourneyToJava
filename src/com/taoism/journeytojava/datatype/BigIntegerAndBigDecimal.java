package com.taoism.journeytojava.datatype;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by chenfei on 14-11-12.
 */
public class BigIntegerAndBigDecimal {
	public static void main(String[] args) {
		System.out.println();

		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers do you need to draw?");
		int k = scanner.nextInt();

		System.out.println("What is the highest number you can draw?");
		int n = scanner.nextInt();

		BigInteger lotteryOdds = BigInteger.valueOf(1);

		for (int i = 1; i <= k; i++) {
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
		}

		System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");

		System.out.println("哈哈");

	}
}
