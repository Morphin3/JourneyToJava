package com.taoism.journeytojava.algorithm.sort;

import java.util.Arrays;

/**
 * Date: 2017-05-24
 * Time: 20:46
 * Author: cf
 * -----------------------------
 * 冒泡排序
 */
public class BubbleSort {


    public static void main(String[] args) {

        int[] source = new int[]{6, 3, 8, 9, 1, 2, 0, 5, 4, 7};


        System.out.println(Arrays.toString(source));

        bubbleSort(source);

        System.out.println(Arrays.toString(source));
//        System.out.println(Arrays.deepToString(source));
    }


    public static void bubbleSort(int[] source) {
        for (int i = 0; i < source.length - 1; i++) {
            for (int j = 0; j < source.length - 1 - i; j++) {
                if (source[j] > source[j + 1]) {
                    int temp = source[j];
                    source[j] = source[j + 1];
                    source[j + 1] = temp;
                }
            }
        }
    }
}
