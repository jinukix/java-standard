package ch09;

import java.util.Random;

public class RandomEx1 {
    public static void main(String[] args) {
        Random r1 = new Random(1);
        Random r2 = new Random(1);

        System.out.println("= r1 =");
        for(int i=0; i < 5; i++)
            System.out.println(i + ":" + r1.nextInt());

        System.out.println("= r2 =");
        for(int i=0; i < 5; i++)
            System.out.println(i + ":" + r2.nextInt());
    }
}