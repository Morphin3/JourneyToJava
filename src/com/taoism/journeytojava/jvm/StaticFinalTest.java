package com.taoism.journeytojava.jvm;

/**
 * Date: 2017-04-28
 * Time: 14:52
 * Author: cf
 * -----------------------------
 */
public class StaticFinalTest {

    public static final String staticAndFinalString = "staticAndFinalString123123";
    public static final int    staticAndFinalint    = 71;
    public static       String onlyStaticString     = "onlyStaticString";
    public static       int    onlyStaticInt        = 72;
    public final        String onlyFinalString       = "onlyFinalString";
    public final        int    onlyFinalInt         = 73;

    public StaticFinalTest() {
//        onlyFinalString = "onlyFinalString";

    }
}
