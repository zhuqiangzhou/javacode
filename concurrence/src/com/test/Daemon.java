package com.test;

import com.utils.SleepUtils;

/**
 * 守护线程
 */
public class Daemon {
    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonRunner(), "DaemonRunner");
        thread.setDaemon(true);
        thread.start();
    }

    static class DaemonRunner implements  Runnable {

        @Override
        public void run() {
           try {
                SleepUtils.second(3);
            } finally {
               System.out.println("DaemonThread finally run.");
           }
        }
    }
}
