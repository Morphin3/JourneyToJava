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

        System.out.println(Math.pow(2.1, 2.3));
        System.out.println(Math.sin(30));
        System.out.println(Math.sin(3.14 / 6));
        System.out.println(Math.cos(30));

        System.out.println(StrictMath.sin(3.14 / 6));


        int i = 1;
        int j = 1;
        if (i++ < 0 & j++ > 0) {

        }
        System.out.println(j);
        i = 0;
        j = 1;
        if (i++ < 0 && j++ > 0) {

        }
        System.out.println(j);

        int n1 = 10;
        int n2 = 7;
        System.out.println(n1 % n2 == (n1 & (n2 - 1)));

        System.out.println(n1 % n2);
        System.out.println(n1 & (n2 - 1));

        String s = "hello";
        char[] chars = {'a', 'b', 'c', 'd'};


        exchange(s, chars);

        System.out.println(s);
        System.out.println(chars);

        OverallTestModel a = new OverallTestModel("a", 0, false);
        OverallTestModel b = new OverallTestModel("b", 1, true);

        exchange(a, b);

        System.out.println(a.getS());

        System.out.println(17%-10);

        getEnclosingClassTest();

    }

    public static OverallTestModel bb = new OverallTestModel("b", 1, true);

    public static void exchange(String str, char[] chars) {
        str = "boy";
        chars = new char[]{'a', 'a', 'c', 'd'};
//        chars[1] = 'a';
    }

    public static void exchange(OverallTestModel a, OverallTestModel b) {
//        a = new OverallTestModel("c", 2, true);

        a.setS("d");
//        a = bb;
    }

    public static void getEnclosingClassTest(){
        System.out.println(new Object(){}.getClass().getEnclosingClass());
    }


}
