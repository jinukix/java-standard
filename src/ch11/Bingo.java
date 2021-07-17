package ch11;

import java.util.*;

public class Bingo {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        int[][] board = new int[5][5];

        while (set.size() < 25) {
            set.add((int)(Math.random()*50+1));
        }

        Iterator iter = set.iterator();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = (int)iter.next();
                System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
            }
            System.out.println();
        }
    }
}
