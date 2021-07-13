package ch07;

public class InnerEx {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv;
        int iiv2 = outerCv;
    }

    static class StaticInner {
//        int siv = outerIv;
        static int scv = outerCv;
    }

    InstanceInner iv = new InstanceInner();
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
        StaticInner obj2 = new StaticInner();

        InnerEx outer = new InnerEx();
        InstanceInner obj = outer.new InstanceInner();
    }

    void instanceMethod() {
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
    }

    void myMethod() {
        int lv = 0;
        final int LV = 0;

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
			int liv3 = lv;
            int liv4 = LV;
        }
        LocalInner li = new LocalInner();
    }

    public static void main(String[] args) {
        Outer oc = new Outer();
        Outer.InstanceInner ii = oc.new InstanceInner();
        ii.method();
        System.out.println("ii.iv : "+ ii.iv);
        System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);

        Outer.StaticInner si = new Outer.StaticInner();
        System.out.println("si.iv : "+ si.iv);
    }
}

class Outer {
    int value = 10;
    Object obj = new Object(){void method(){}}; // 익명 클래스
    static Object obj2 = new Object(){void method(){}}; // 익명 클래스
    void myMethod2() {
        Object lv = new Object(){ void method(){} };	// 익명클래스
    }

    class InstanceInner {
        int iv=100;
        int value=20;

        void method() {
            int value = 30;
            System.out.println("            value :" + value);
            System.out.println("       this.value :" + this.value);
            System.out.println("Outer2.this.value :" + Outer.this.value);
        }
    }
    static class StaticInner {
        int iv=200;
        static int cv=300;
    }

    void myMethod() {
        class LocalInner {
            int iv=400;
        }
    }
}
