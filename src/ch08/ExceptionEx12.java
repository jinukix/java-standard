package ch08;

public class ExceptionEx12 {
    public static void main(String[] args) throws Exception {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}
