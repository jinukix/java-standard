package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx5 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");
        setA.add("2");
        setA.add("3");
        setA.add("4");
        setA.add("5");
        System.out.println("A = "+setA);

        setB.add("4");
        setB.add("5");
        setB.add("6");
        setB.add("7");
        setB.add("8");
        System.out.println("B = "+setB);

        System.out.println("A ∩ B = " + retainAll(setA, setB));  // 한글 ㄷ을 누르고 한자키
        System.out.println("A ∪ B = " + addAll(setA, setB));  // 한글 ㄷ을 누르고 한자키
        System.out.println("A - B = " + removeAll(setA, setB));
    }

    private static Set retainAll(Set<String> a, Set<String> b) {
        Set copyA = new HashSet<>();
        copyA.addAll(a);

        copyA.retainAll(b);
        return copyA;
    }

    private static Set removeAll(Set<String> a, Set<String> b) {
        Set copyA = new HashSet<>();
        copyA.addAll(a);

        copyA.removeAll(b);
        return copyA;
    }

    private static Set addAll(Set<String> a, Set<String> b) {
        Set copyA = new HashSet<>();
        copyA.addAll(a);
        copyA.addAll(b);
        return copyA;
    }
}