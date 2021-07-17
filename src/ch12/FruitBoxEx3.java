package ch12;

import java.util.ArrayList;

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox3<Fruit3> fruitBox = new FruitBox3<Fruit3>();
        FruitBox3<Apple3> appleBox = new FruitBox3<Apple3>();

        fruitBox.add(new Apple3());
        fruitBox.add(new Grape3());
        appleBox.add(new Apple3());
        appleBox.add(new Apple3());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
}

class Fruit3		        { public String toString() { return "Fruit";}}
class Apple3 extends Fruit3 { public String toString() { return "Apple";}}
class Grape3 extends Fruit3 { public String toString() { return "Grape";}}

class FruitBox3<T extends Fruit3> extends Box3<T> {}

class Box3<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item);      }
    T get(int i)     { return list.get(i); }
    ArrayList<T> getList() { return list;  }
    int size()       { return list.size(); }
    public String toString() { return list.toString();}
}

class Juice {
    String name;
    Juice(String name){this.name = name + "Juice";}
    public String toString() {return name;}
}

class Juicer {
    static Juice makeJuice(FruitBox3<? extends Fruit3> box) {
        String tmp = "";

        for(Fruit3 fruit3 : box.getList()) {
            tmp += fruit3 + " ";
        }
        return new Juice(tmp);
    }
}

