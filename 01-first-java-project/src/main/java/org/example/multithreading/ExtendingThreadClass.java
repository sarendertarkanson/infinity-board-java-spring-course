package org.example.multithreading;

class NumberThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ExtendingThreadClass {
    public static void main(String[] args) {

        NumberThread thread1 = new NumberThread();
        NumberThread thread2 = new NumberThread();

        thread1.setName("thread1");
        thread2.setName("thread2");

        thread1.start();
        thread2.start();

    }
}
