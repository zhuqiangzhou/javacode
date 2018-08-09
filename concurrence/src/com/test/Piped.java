package com.test;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * 管道输入流和输出流
 */
public class Piped {
    public static void main(String[] args) throws IOException {
        PipedWriter out = new PipedWriter();
        PipedReader in = new PipedReader();
        //将输出流和输入行连接，否则在使用时会抛出IOException
        out.connect(in);
        Thread prindThread = new Thread(new Print(in), "PrintThread");
        prindThread.start();
        int receive = 0;
        try {
            while ((receive = System.in.read()) != -1) {  //system.in.read()返回的是输入值的ASKII码值
                out.write(receive);
            }
        } finally {
            out.close();
        }
    }

    static class Print implements Runnable {
        private PipedReader in;

        public Print(PipedReader in) {
            this.in = in;
        }

        @Override
        public void run() {
            int receive = 0 ;
            try {
                while ((receive = in.read()) != -1) {
                    System.out.println((char) receive);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
