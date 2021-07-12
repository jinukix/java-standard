package ch03;

public class Operator16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        float shortPi = (int)(pi*1000) / 1000f;
        System.out.println(shortPi);

        shortPi = (int)(pi*1000 + 0.5) / 1000f;
        System.out.println(shortPi);

        shortPi = Math.round(pi*1000) / 1000f;
        System.out.println(shortPi);
    }
}
