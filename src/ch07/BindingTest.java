package ch07;

public class BindingTest {
    public static void main(String[] args) {
        Parent3 p3 = new Child3();
        System.out.println(p3.x); // 멤버변수는 참조타입에 따라감
        p3.method(); // 멤버 메소드는 인스턴스에 따라감.

        Child3 c3 = new Child3();
        System.out.println(c3.x);
        c3.method();
    }
}

class Parent3 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }

}

class Child3 extends Parent3 {
    int x = 200;

    void method() {
        super.method();
        System.out.println("Child Method");
        System.out.println("x=" + x);
        System.out.println("super.x=" + super.x);
        System.out.println("this.x="  + this.x);
    }
}