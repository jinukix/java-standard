package ch10;

import java.text.ChoiceFormat;

public class ChoiceFormatEx {
    public static void main(String[] args) {
        double[] limits = {60, 70, 80, 90};
        String[] grades = {"D", "C", "B", "A"};

        ChoiceFormat form = new ChoiceFormat(limits, grades);

        int[] scores = { 100, 95, 88, 70, 52, 60, 70};

        for (int i=0;i<scores.length;i++) {
            System.out.println(scores[i]+":"+form.format(scores[i]));
        }

        String pattern = "60#D|70#C|80<B|90#A";
        int[] scores2 = { 91, 90, 80, 88, 70, 52, 60};

        ChoiceFormat form2 = new ChoiceFormat(pattern);

        for (int i=0;i<scores2.length;i++) {
            System.out.println(scores2[i]+": "+form2.format(scores2[i]));
        }

    }
}
