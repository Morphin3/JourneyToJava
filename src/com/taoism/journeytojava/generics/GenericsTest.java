package com.taoism.journeytojava.generics;

import java.util.Comparator;

/**
 * Date: 2016-08-18
 * Time: 16:31
 * Author: cf
 * -----------------------------
 */
public class GenericsTest {


    public static void main(String[] args) {
//        Pair<String>[] table = new Pair<String>[10];
        Pair<String>[] table = (Pair<String>[]) new Pair<?>[10];

        Object[] objects = table;

        makePair(String.class);

        Object[] objectarray = table;
        objectarray[0] = new Pair<String>("asdf","asdf");


    }


    public static <T extends String & Comparator> T getMiddle(T t) {
        return t;
    }

    public static class Pair<T> {
        T first;
        T second;

        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }
    }

    public static <T> Pair<T> makePair(Class<T> cl) {

        try {
            return new Pair<>(cl.newInstance(), cl.newInstance());
        } catch (Exception ex) {
            return null;
        }


    }




}
