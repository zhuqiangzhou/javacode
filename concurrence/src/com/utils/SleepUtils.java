package com.utils;

import java.util.concurrent.TimeUnit;

/**
 * Created by 96300 on 2018/7/7.
 */
public class SleepUtils {
    public static final void second (long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        }catch (InterruptedException e) {

        }
    }
}
