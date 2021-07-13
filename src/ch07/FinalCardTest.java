package ch07;

public class FinalCardTest {
    public static void main(String[] args) {
        Card2 c = new Card2("HEART", 10);
//        c.NUMBER = 100;
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }

}

class Card2 {
    final int NUMBER;
    final String KIND;

    Card2(String kind, int number) {
        KIND = kind;
        NUMBER = number;
    }

    Card2() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}
