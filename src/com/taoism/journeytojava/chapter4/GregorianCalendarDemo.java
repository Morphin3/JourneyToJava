package com.taoism.journeytojava.chapter4;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Morphin3 on 1/5/15.
 */
public class GregorianCalendarDemo {
    public static void main(String[] srgs) {
        GregorianCalendar deadline = new GregorianCalendar();
        deadline = new GregorianCalendar(1990, 11, 16);
        deadline = new GregorianCalendar(1990, Calendar.NOVEMBER, 16);
        deadline = new GregorianCalendar(1990, Calendar.NOVEMBER, 16, 23, 59, 59);

        GregorianCalendar now = new GregorianCalendar();
        int month = now.get(Calendar.MONTH);
        int weekday = now.get(Calendar.DAY_OF_WEEK);

        System.out.println(month + " " + weekday);

        deadline.set(Calendar.YEAR, 2003);
        deadline.set(Calendar.MONDAY, Calendar.MARCH);
        deadline.set(Calendar.DAY_OF_MONTH, 3);

        System.out.println(deadline.getTime());

        deadline.set(2007, Calendar.JULY, 7);
        System.out.println(deadline.getTime());

        deadline.setTime(now.getTime());
        System.out.println(deadline.getTime());
    }
}
