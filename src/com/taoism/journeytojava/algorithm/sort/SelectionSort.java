package com.taoism.journeytojava.algorithm.sort;

import java.util.Arrays;

/**
 * Date: 2017-05-25
 * Time: 10:51
 * Author: cf
 * -----------------------------
 * 选择排序
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] source = new int[]{6, 3, 8, 9, 1, 2, 0, 5, 4, 7};


        System.out.println(Arrays.toString(source));

        selectionSort(source);

        System.out.println(Arrays.toString(source));

    }


    public static void selectionSort(int[] source) {
        for (int i = 0; i < source.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < source.length; j++) {
                if (source[j] < source[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = source[i];
            source[i] = source[minIndex];
            source[minIndex] = temp;
        }
    }


}
