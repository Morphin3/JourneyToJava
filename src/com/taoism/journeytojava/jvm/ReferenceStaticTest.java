package com.taoism.journeytojava.jvm;

/**
 * Date: 2017-04-28
 * Time: 16:00
 * Author: cf
 * -----------------------------
 */
public class ReferenceStaticTest {



    String staticAndFinalString = StaticFinalTest.staticAndFinalString;
    static String staticAndFinalStringOut =  StaticFinalTest.staticAndFinalString;

    public ReferenceStaticTest() {

//        String staticAndFinalString = Agency.agency;
        int staticAndFinalint = StaticFinalTest.staticAndFinalint;
        int staticAndFinalint2 = StaticFinalTest.staticAndFinalint;
        String onlyStaticString = StaticFinalTest.onlyStaticString;
        int onlyStaticInt = StaticFinalTest.onlyStaticInt;
//        String onlyFinalString = StaticFinalTest.onlyFinalString;
//        int onlyFinalInt = StaticFinalTest.onlyFinalInt;

//        int heihei = StaticFinalTest.staticAndFinal2;

    }

}
