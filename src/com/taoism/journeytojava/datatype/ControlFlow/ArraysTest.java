package com.taoism.journeytojava.datatype.controlflow;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Morphin3 on 12/31/14.
 */
public class ArraysTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int[] result = Arrays.copyOf(numbers, 4);


        for (int r : result) {
            System.out.println(r);
        }
        System.out.println("---");

        System.out.println(Arrays.binarySearch(numbers, 8));
        System.out.println(Arrays.binarySearch(numbers, 3, 7, 8));


        Arrays.fill(result, 3);

        for (int r : result) {
            System.out.println(r);
        }

        int[] equalsTest = {3, 3, 3, 3};
//
        System.out.println(Arrays.equals(result, equalsTest));

        for (int r : equalsTest) {
            System.out.println(r);
        }

        System.out.println("---");

        int[] numbersTarget = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.arraycopy(numbers, 2, numbersTarget,8, 2);

        for (int r : numbersTarget) {
            System.out.println(r);
        }





    }
}
