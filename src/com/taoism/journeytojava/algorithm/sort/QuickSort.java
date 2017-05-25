package com.taoism.journeytojava.algorithm.sort;

import java.util.Arrays;

/**
 * Date: 2017-05-24
 * Time: 20:46
 * Author: cf
 * -----------------------------
 * 快速排序
 */
public class QuickSort {


    public static void main(String[] args) {

        int[] source = new int[]{6, 3, 8, 9, 1, 2, 0, 5, 4, 7};

        System.out.println(Arrays.toString(source));

        quickSort(source, 0, source.length - 1);

        System.out.println(Arrays.toString(source));

    }

    public static void quickSort(int[] source, int lo, int hi) {

        if (hi <= lo) {
            return;
        }

        int j = partision(source, lo, hi);

        quickSort(source, lo, j - 1);
        quickSort(source, j + 1, hi);


    }


    public static int partision(int[] source, int lo, int hi) {
        int middle;

        middle = source[lo];

        int i = lo;
        int j = hi + 1;


        while (true) {
            while (source[++i] < middle) {
                if (i == hi) {
                    break;
                }
            }

            while (middle < source[--j]) {
                if (j == lo) {
                    break;
                }
            }

            if (i >= j) {
                exch(source, lo, j);
                break;
            }

            exch(source, i, j);

        }

        return j;

    }

    public static void exch(int[] source, int i, int j) {
        int temp = source[i];
        source[i] = source[j];
        source[j] = temp;
    }

}
