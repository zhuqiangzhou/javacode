package com.test;

import java.util.concurrent.TimeUnit;

/**
 * Created by 96300 on 2018/7/28.
 */
public class Join {
    public static void main(String[] args) throws InterruptedException {
        Thread previous = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            //每个线程拥有前一个线程的引用,需要等待前一个线程终止,才能从等待中返回
            Thread thread = new Thread(new Domino(previous), String.valueOf(i));
            thread.start();
            previous = thread;
            TimeUnit.SECONDS.sleep(5);
            System.out.println(Thread.currentThread().getName() + "terminate.");
        }
    }
    static class Domino implements Runnable {
        private Thread thread;

        public Domino(Thread thread) {
            this.thread = thread;
        }

        @Override
        public void run() {
            try {
                thread.join();
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName() + "terminate.");
        }
    }
}
