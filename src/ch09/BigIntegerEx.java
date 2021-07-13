package ch09;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

import static java.math.RoundingMode.HALF_UP;

public class BigIntegerEx {
    public static void main(String[] args) throws Exception{
        BigInteger big = BigInteger.ONE;
        System.out.println(big);

        for(int i=1; i<100;i++) {
            System.out.printf("%d!=%s%n", i, calcFactorial(i));
            Thread.sleep(300);
        }
    }

    static String calcFactorial(int n) {
        return factorial(BigInteger.valueOf(n)).toString();
    }

    static BigInteger factorial(BigInteger n) {
        if(n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {  // return n * factorial(n-1);
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }
}
