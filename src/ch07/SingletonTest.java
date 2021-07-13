package ch07;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
    }
}

final class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){};

    public static Singleton getInstance() {
        if(instance==null) {
            instance = new Singleton();
        }
        return instance;
    }
}