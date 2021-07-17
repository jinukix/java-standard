package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {
    public static void main(String[] args) {
        ArrayList original = new ArrayList(10);
        ArrayList copy1    = new ArrayList(10);
        ArrayList copy2    = new ArrayList(10);

        for (int i = 0; i < 10; i++) {
            original.add(i);
        }

        Iterator iter = original.iterator();

        while(iter.hasNext())
            copy1.add(iter.next());

        System.out.println("= Original에서 copy1로 복사(copy) =");
        System.out.println("original:"+original);
        System.out.println("copy1:"+copy1);
        System.out.println();

        iter = original.iterator();

        while(iter.hasNext()){
            copy2.add(iter.next());
            iter.remove();
        }

        System.out.println("= Original에서 copy2로 이동(move) =");
        System.out.println("original:"+original);
        System.out.println("copy2:"+copy2);
    }
}
