package ch09;

import static java.lang.Math.*;

public class MatchEx2 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;

        System.out.println("i ="+i);
        System.out.println("-i= "+(-i));

        try {
            System.out.println(negateExact(10));
            System.out.println(negateExact(-10));
            System.out.println(negateExact(i)); // 에외 발생
        } catch(ArithmeticException e) {
            // i를 long타입으로 형변환 다음에 negateExact(long a)를 호출
            System.out.println(negateExact((long)i));
        }
    }
}
