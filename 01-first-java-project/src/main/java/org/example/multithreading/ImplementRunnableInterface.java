package org.example.multithreading;


class NumberRunnable implements Runnable {
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

public class ImplementRunnableInterface {

    public static void main(String[] args) {
        NumberRunnable numberTask = new NumberRunnable();

        Thread thread1 = new Thread(numberTask);
        Thread thread2 = new Thread(numberTask);

        thread1.setName("thread1");
        thread2.setName("thread2");

        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
