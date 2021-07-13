package ch09;

import java.util.*;

public class StringTokenizerEx1 {
    public static void main(String[] args){
        String source = "100,200,300,400";
        StringTokenizer st1 = new StringTokenizer(source, ",");

        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }

        String expression = "x=100*(200+300)/2";
        StringTokenizer st2 = new StringTokenizer(expression, "+-*/=()", true);

        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }
    }
}
