package ch06;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("black", "manual", 6);
        Car c3 = new Car("yellow");
        Car c4 = new Car(c2);

        c2.door = 100;
        System.out.println(c1); // color=white, gearType=auto, door=4
        System.out.println(c2); // color=black, gearType=manual, door=100
        System.out.println(c3); // color=yellow, gearType=auto, door=4
        System.out.println(c4); // color=black, gearType=manual, door=6
    }
}

class Car {
    String color;
    String gearType;
    int door;

    @Override
    public String toString() {
        return "color=" + this.color + ", gearType=" + this.gearType+ ", door="+this.door;
    }

    Car() {}
    Car(String color) {this(color, "auto", 4);}
    Car(Car car) {
        color = car.color;
        gearType = car.gearType;
        door = car.door;
    }
//    Car(Car car) {this(car.color, car.gearType, car.door);}
    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}
