package ch08;

public class ExceptionEx01 {
    public static void main(String[] args) {
        try {
            try {} catch (Exception e) {}
        } catch (Exception e) {
            try {} catch (Exception ex) {}
        }

        try { } catch (Exception e) { }
    }
}
