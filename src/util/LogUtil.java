package util;

/**
 * Date: 2016-06-22
 * Time: 09:48
 * Author: cf
 * -----------------------------
 */
public class LogUtil {

    public static void log(String value) {
        System.out.println("Journey --- " + value);
    }


    public static void log(String tag, String value) {
        System.out.println(tag + " = " + value);
    }

}
