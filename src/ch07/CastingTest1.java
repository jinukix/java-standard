package ch07;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        Car car2 = new Car();
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();

        car = fe;
//        car.water(); // 에러.
        fe2 = (FireEngine) car2; // 컴파일은 OK. 실행 시 에러
        fe2 = (FireEngine) car;
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("Drive");
    }

    void stop() {
        System.out.println("stop");
    }
}

class FireEngine extends Car {
    void drive() {
        System.out.println("Fire Drive");
    }

    void water() {
        System.out.println("water");
    }
}
