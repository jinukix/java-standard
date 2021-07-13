package ch07;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine2 fe = new FireEngine2();

        if(fe instanceof FireEngine2) {
            System.out.println("This is a FireEngine2 instance.");
        }

        if(fe instanceof Car2) {
            System.out.println("This is a Car2 instance.");
        }

        if(fe instanceof Object) {
            System.out.println("This is an Object instance.");
        }

        System.out.println(fe.getClass().getName());
    }
}

class Car2 {}
class FireEngine2 extends Car2 {}