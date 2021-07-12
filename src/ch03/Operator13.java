package ch03;

public class Operator13 {
    public static void main(String[] args) {
        char c1 = 'a';

//        char c2 = c1+1; // 컴파일 에러
        char c2 = 'a'+1; // 'a'+1은 리터럴 연산이기 때문. 컴파일하면 자동으로 char c2 = 'b';

        System.out.println(c2);

    }
}
