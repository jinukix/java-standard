package ch07;

public class SuperTest {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.method();
    }
}

class Parent2 {int x = 10;}
class Child2 extends Parent2 {
    int x = 20;
    void method() {
        int x = 30;
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
}

