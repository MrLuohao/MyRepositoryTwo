package com.JdCollege.Test;

public class SS {
    class a {
    }

    class b {
    }

    static Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            synchronized (a.class) {
                synchronized (b.class) {
                    System.out.println("第一个线程正在执行...");
                }
            }
        }
    });
    static Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            synchronized (b.class) {
                synchronized (a.class) {
                    System.out.println("第二个线程正在执行...");
                }
            }
        }
    });

    public static void main(String[] args) {
        SS.thread.start();
        SS.thread1.start();
    }
}
