package com.kodewala.day58;

class OddThread extends Thread {

    @Override
    public void run() {

        int count = 0;

        for (int i = 1; i <= 20; i += 2) {

            System.out.println(Thread.currentThread().getName()
                    + " : " + i);

            count++;

            // Sleep after printing 10 odd numbers
            if (count == 10) {
                try {
                    System.out.println(Thread.currentThread().getName()
                            + " Sleeping for 5 seconds...");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class EvenThread extends Thread {

    @Override
    public void run() {

        int count = 0;

        for (int i = 2; i <= 20; i += 2) {

            System.out.println(Thread.currentThread().getName()
                    + " : " + i);

            count++;

            // Sleep after printing 10 even numbers
            if (count == 10) {
                try {
                    System.out.println(Thread.currentThread().getName()
                            + " Sleeping for 5 seconds...");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Driver7 {

    public static void main(String[] args) {

        System.out.println("Main Thread : "
                + Thread.currentThread().getName());

        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();

        odd.setName("Odd-Thread");
        even.setName("Even-Thread");

        odd.start();
        even.start();
    }
}