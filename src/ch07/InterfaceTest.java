package ch07;

interface I {
    public abstract void play();
    public abstract void methodB();
}

class InstanceManager {
    private InstanceManager() {};
    public static I getInstance() {
        return new B();
    }
}

class A {
    public void methodA() {
        I i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());
    }
    public void autoPlay(I i) {
        i.play();
    }
}

class B implements I {
    @Override
    public void play() {
        System.out.println("play in B class");
    }

    @Override
    public void methodB() {
        System.out.println("methodB in B3 class");
    }

    public String toString() {return "class B3";}
}

class C implements I {
    @Override
    public void play() {
        System.out.println("play in C class");
    }

    @Override
    public void methodB() { }
}

class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.autoPlay(new B());
        a.autoPlay(new C());

        a.methodA();
    }
}
