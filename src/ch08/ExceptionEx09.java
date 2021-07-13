package ch08;

public class ExceptionEx09 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("런타임 에러");
        } catch (RuntimeException e) {
            if (e instanceof Exception) {
                System.out.println("에러 메시지 : " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
