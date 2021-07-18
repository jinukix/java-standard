package ch13;

public class ThreadEx01 {
    public static void main(String[] args) {
        ThreadEx_1 t1 = new ThreadEx_1();

        Runnable runnable = new ThreadEx_2();
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();
    }
}

class ThreadEx_1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("1: " + Thread.currentThread());
        }
    }
}

class ThreadEx_2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("2: " + Thread.currentThread());
        }
    }
}