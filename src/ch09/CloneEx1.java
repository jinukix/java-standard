package ch09;

import java.util.Arrays;

public class CloneEx1 {
    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = (Point) original.clone();
        System.out.println(original);
        System.out.println(copy);

        int[] arr = {1,2,3};
        int[] arrClone = arr.clone();
        arrClone[0] = 6;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
    }
}

class Point implements Cloneable{
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x="+x +", y="+y;
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();  // clone()은 반드시 예외처리를 해주어야 한다.
        } catch (CloneNotSupportedException e) {e.printStackTrace();}
        return obj;
    }
}
