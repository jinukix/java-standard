package ch07;

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        b.buy(new Tv4());
        b.buy(new Computer2());
        b.buy(new Audio());
        b.summary();
    }
}

class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;
    Product2[] item = new Product2[10];
    int i = 0;

    void buy(Product2 product) {
        if(money < product.price){
            System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
            return;
        }

        money-=product.price;
        bonusPoint+= product.bonusPoint;
        item[i++] = product;
        System.out.println(product + "을/를 구입하셨습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for (int j = 0; j < item.length; j++) {
            if(item[i]==null) break;
            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

class Product2 {
    int price;
    int bonusPoint;

    Product2(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv4 extends Product2 {
    Tv4() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer2 extends Product2 {
    Computer2() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product2 {
    Audio() {
        super(200);
    }

    public String toString() {
        return "Audio";
    }
}