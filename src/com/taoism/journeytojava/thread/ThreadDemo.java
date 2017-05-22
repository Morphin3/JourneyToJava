package com.taoism.journeytojava.thread;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Date: 2017-01-14
 * Time: 16:13
 * Author: cf
 * -----------------------------
 */
public class ThreadDemo {


    public static void main(String[] args) {

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    while (true) {
//
//                        Thread.sleep(1000);
////                        Thread.currentThread().interrupt();
//                        LogUtil.log("睡眠1秒");
//
//                    }
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//
//        final Thread thread = new Thread(runnable);
//
//        thread.start();


        System.out.println(ThreadLocalRandom.current().nextInt());

    }

}
