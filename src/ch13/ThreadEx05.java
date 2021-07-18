package ch13;

public class ThreadEx05 {
    static long startTime = 0;
    public static void main(String[] args) {
        ThreadEx05_1 th1 = new ThreadEx05_1();
        th1.start();
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 300 ; i++) {
            System.out.print("-");
        }
        System.out.println(System.currentTimeMillis() - ThreadEx05.startTime);
    }
}

class ThreadEx05_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
        }
        System.out.println(System.currentTimeMillis() - ThreadEx05.startTime);
    }
}