package com.taoism.journeytojava.algorithm.sort;

import java.util.Arrays;

/**
 * Date: 2017-05-25
 * Time: 09:48
 * Author: cf
 * -----------------------------
 * 插入排序
 */
public class InsertionSort {


    public static void main(String[] args) {

        int[] source = new int[]{6, 3, 8, 9, 1, 2, 0, 5, 4, 7};

        System.out.println(Arrays.toString(source));

        insertionSort(source);

        System.out.println(Arrays.toString(source));

    }


    public static void insertionSort(int[] source) {

        for (int i = 0; i < source.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {

                if (source[j] >= source[j - 1]) {
                    break;
                }

                int temp = source[j];
                source[j] = source[j - 1];
                source[j - 1] = temp;

            }

        }

    }

}
