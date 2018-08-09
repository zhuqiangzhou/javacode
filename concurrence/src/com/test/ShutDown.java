package com.test;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * 终止线程
 * Created by 96300 on 2018/7/7.
 */
public class ShutDown {
    public static void main(String[] args) throws InterruptedException {
        Runner one = new Runner();
        Thread countThread = new Thread(one, "CountThread");
        countThread.start();
        //睡眠1秒，main线程对CountThread进行中断，使CountThread能够感知中断为false而结束
        TimeUnit.SECONDS.sleep(1);
        countThread.interrupt();

        Runner two = new Runner();
        countThread = new Thread(two,"CountThread");
        countThread.start();

        //睡眠一秒，main线程对Runner two进行取消，使CountThread能够感知on为false而结束
        TimeUnit.SECONDS.sleep(1);
        two.cancel();
    }
    private static class Runner implements Runnable {
        private volatile boolean on = true;
        private long i;

        @Override
        public void run() {
            while (on && ! Thread.currentThread().isInterrupted()) {
                i++;
            }
            System.out.println("Count i = " + i);
        }

        public void cancel () {
            on = false;
        }
    }
}
