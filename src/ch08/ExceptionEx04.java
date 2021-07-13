package ch08;

public class ExceptionEx04 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0/0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("예외메시지 : " + e.getMessage());
        }
    }
}
