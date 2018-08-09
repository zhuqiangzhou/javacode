package com.test;

import com.utils.SleepUtils;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * 中断线程
 */
public class Deprecated {
    public static void main(String[] args) throws InterruptedException {
        DateFormat format = new SimpleDateFormat("HH:mm:ss");
        Thread printThread = new Thread(new Runner(),"PrintThread");
        printThread.setDaemon(true);
        printThread.start();
        TimeUnit.SECONDS.sleep(3);
        //将PrintThread进行暂停，输出内容工作停止
        printThread.suspend();
        System.out.println("main suspend PrintThread at " + format.format(new Date()));

        TimeUnit.SECONDS.sleep(3);
        //将PrintThread进行恢复，输出内容工作继续
        printThread.resume();
        System.out.println("main resume PrintThread at " + format.format(new Date()));

        TimeUnit.SECONDS.sleep(3);
        //将PrintThread进行终止，输出内容终止
        printThread.stop();
        System.out.println("main stop PrintThread at " + format.format(new Date()));
        TimeUnit.SECONDS.sleep(3);
    }

    static class Runner implements Runnable {

        @Override
        public void run() {
            DateFormat format = new SimpleDateFormat("HH:mm:ss");
            while (true) {
                System.out.println(Thread.currentThread().getName() + "Run at" + format.format(new Date()));
                SleepUtils.second(1);
            }
        }
    }
}
