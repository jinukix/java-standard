package ch13;

import javax.swing.*;

public class ThreadEx13 {
    public static void main(String[] args) {
        ThreadEx13_2 th1 = new ThreadEx13_2();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
        th1.interrupt();
        System.out.println("isInterrupted():"+ th1.isInterrupted());
    }
}


class ThreadEx13_2 extends Thread {
    public void run() {
        int i = 10;

        while(i!=0 && !isInterrupted()) {
            System.out.println(i--);
            for(long x=0;x<2500000000L;x++);
        }

        System.out.println("카운트가 종료되었습니다.");
    }
}