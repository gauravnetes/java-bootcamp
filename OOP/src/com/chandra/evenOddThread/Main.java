package com.chandra.evenOddThread;


class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 49; i+=2) {
            System.out.println("Odd: " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Odd Thread Interrupted");
            }
        }
    }
}

class EvenThread extends Thread {
    public void run() {
        for(int i = 2; i <= 50; i += 2) {
            System.out.println("Even: " + i);

            try {
                Thread.sleep(100);
            } catch(InterruptedException e) {
                System.out.println("Even Thread Interrupted");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();

        odd.start();
        even.start();
    }

}
