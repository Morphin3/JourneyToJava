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



        int i=1;
        int j=1;
        if(i++ <0&j++>0){

        }
        System.out.println(j);
        i=0;
        j=1;
        if(i++ <0&&j++>0){

        }
        System.out.println(j);

        int n1 = 10;
        int n2 = 7;
        System.out.println(n1%n2==(n1&(n2-1)));

        System.out.println(n1%n2);
        System.out.println(n1&(n2-1));



    }

}
