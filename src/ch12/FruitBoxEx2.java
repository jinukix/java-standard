package ch12;

import java.util.ArrayList;

public class FruitBoxEx2{
    public static void main(String[] args) {
        FruitBox2<Fruit2> box1 = new FruitBox2<>();
        FruitBox2<Apple2> box2 = new FruitBox2<>();
        FruitBox2<Grape2> box3 = new FruitBox2<>();

        box1.add(new Fruit2());
        box1.add(new Apple2());
        box1.add(new Grape2());
        box2.add(new Apple2());
//		box2.add(new Grape2());  // 에러. Grape는 Apple의 자손이 아님
        box3.add(new Grape2());

        System.out.println("box1-"+box1);
        System.out.println("box2-"+box2);
        System.out.println("box3-"+box3);
    }
}

class FruitBox2<T extends Fruit2 & Eatable> extends Box2<T> {};

interface Eatable {}
class Fruit2 implements Eatable {public String toString() {return "Fruit";}}
class Apple2 extends Fruit2 {public String toString() {return "Apple";}}
class Grape2 extends Fruit2 {public String toString() {return "Grape";}}
class Toy2{public String toString() {return "Toy";}}


class Box2<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item)  { list.add(item);}
    T get(int i)      { return list.get(i); }
    int size()        { return list.size();  }
    public String toString() { return list.toString();}
}

