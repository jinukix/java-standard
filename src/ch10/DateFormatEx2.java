package ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatEx2 {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat sdf2, sdf3, sdf4;
        SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("yy년 MMM dd일 E요일");
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

        sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
        sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");
        sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");
        sdf8 = new SimpleDateFormat("오늘은 이 달의 W번째 주입니다.");
        sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.");

        System.out.println(sdf1.format(today));
        System.out.println(sdf2.format(today));
        System.out.println(sdf3.format(today));
        System.out.println(sdf4.format(today));
        System.out.println();
        System.out.println(sdf5.format(today));
        System.out.println(sdf6.format(today));
        System.out.println(sdf7.format(today));
        System.out.println(sdf8.format(today));
        System.out.println(sdf9.format(today));

        Calendar cal = Calendar.getInstance();
        cal.set(2005, 9, 3);	// 2005년 10월 3일 - Month는 0~11의 범위를 갖는다.

        Date day = cal.getTime();

        SimpleDateFormat sdf10, sdf11, sdf12, sdf13;
        sdf10 = new SimpleDateFormat("yyyy-MM-dd");
        sdf11 = new SimpleDateFormat("yy-MM-dd E요일");
        sdf12 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf13 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

        System.out.println(sdf10.format(day));
        System.out.println(sdf11.format(day));
        System.out.println(sdf12.format(day));
        System.out.println(sdf13.format(day));
    }
}
