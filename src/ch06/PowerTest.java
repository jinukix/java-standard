package ch06;

public class PowerTest {
    static long power(int x, int n) {
        if (n==1) return x;
        return x * power(x, n-1);
    }

    public static void main(String[] args) {
        int x = 3;
        int n = 5;
        long result = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println(power(x, i));
            result+=power(x, i);
        }
        System.out.println("result: " +result);
    }
}
