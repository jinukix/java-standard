package ch08;

public class FinallyTest {
    public static void main(String[] args) {
        FinallyTest.startInstall();
        System.out.println("startInstall수행 끝");
    }

    static void startInstall(){
        try {
            System.out.println("startInstall 호출");
            return;
        } finally {
            System.out.println("finally");
        }
    }
}
