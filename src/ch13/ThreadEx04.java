package ch13;

public class ThreadEx04 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 500; i++) {
            System.out.printf("%s", new String("-"));
        }

        System.out.println(System.currentTimeMillis() - startTime);

        for (int i = 0; i < 500; i++) {
            System.out.printf("%s", new String("|"));
        }

        System.out.println(System.currentTimeMillis() - startTime);
    }
}
