package com.taoism.journeytojava.chapter4;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by Morphin3 on 1/5/15.
 */
public class CalendarTest4_1 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        int month = calendar.get(Calendar.MONTH);
        int today = calendar.get(Calendar.DAY_OF_MONTH);

        calendar.set(Calendar.DAY_OF_MONTH, 1);

        Locale.setDefault(Locale.CHINA);

        int weekday = calendar.get(Calendar.DAY_OF_WEEK);

        int firstDayOfWeek = calendar.getFirstDayOfWeek();

        int indent = 0;
        while (weekday != firstDayOfWeek) {
            indent++;
            calendar.add(Calendar.DAY_OF_MONTH, -1);
            weekday = calendar.get(Calendar.DAY_OF_WEEK);
        }

        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();

        do {
            System.out.printf("%5s", weekdayNames[weekday]);
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            weekday = calendar.get(Calendar.DAY_OF_WEEK);
        } while (weekday != firstDayOfWeek);

        System.out.println();

        for (int i = 1; i <= indent; i++) {
            System.out.print("       ");
        }

        calendar.set(Calendar.DAY_OF_MONTH, 1);

        do {
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%6d", day);
            if (day == today) {
                System.out.printf("*");
            } else {
                System.out.printf(" ");
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            weekday = calendar.get(Calendar.DAY_OF_WEEK);
            if (weekday == firstDayOfWeek) {
                System.out.println();
            }
        } while (calendar.get(Calendar.MONTH) == month);

        if (weekday != firstDayOfWeek) {
            System.out.println();
        }
    }
}
