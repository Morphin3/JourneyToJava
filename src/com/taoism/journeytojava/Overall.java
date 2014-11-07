package com.taoism.journeytojava;

/**
 * Created by chenfei on 14-11-5.
 */
public class Overall {
    public static void main(String[] args) {
        int n = 12;
//        int n = 87654321;
        int fourthBitFromRight = (n & 8) / 8;
        System.out.println(fourthBitFromRight);

        System.out.println(Math.pow(2.1,2.3));
        System.out.println(Math.sin(30));
        System.out.println(Math.sin(3.14/6));
        System.out.println(Math.cos(30));

        System.out.println(StrictMath.sin(3.14/6));
    }

}
