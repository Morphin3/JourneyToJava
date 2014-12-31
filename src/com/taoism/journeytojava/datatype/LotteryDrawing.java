package com.taoism.journeytojava.datatype;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Morphin3 on 12/31/14.
 * Array.sort() 乐透随机数 排序
 */
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int k = scanner.nextInt();
        System.out.print("What is the highest number you can draw?");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int[] results = new int[k];
        for (int i = 0; i < results.length; i++) {
            int r = (int) (Math.random() * n);
            results[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;
        }

        Arrays.sort(results);
        for (int r : results) {
            System.out.println(r);
        }


    }
}
