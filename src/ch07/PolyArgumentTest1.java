package ch07;

public class PolyArgumentTest1 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv3());
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product product) {
        if(money < product.price){
            System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
            return;
        }

        money-=product.price;
        bonusPoint+= product.bonusPoint;
        System.out.println(product + "을/를 구입하셨습니다.");
    }
}

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv3 extends Product {
    Tv3() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}
