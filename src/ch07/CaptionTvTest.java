package ch07;

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;				// 조상 클래스로부터 상속받은 멤버
        ctv.channelUp();				// 조상 클래스로부터 상속받은 멤버
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello, World");
        ctv.caption = true;				    // 캡션기능을 켠다.
        ctv.displayCaption("Hello, World");	// 캡션을 화면에 보여 준다.
    }
}

class Tv {
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class CaptionTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}
