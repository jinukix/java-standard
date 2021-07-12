package ch06;

class Tv {
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

public class TvTest {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        t2 = t1;		// t1이 저장하고 있는 값(주소)을 t2에 저장한다.
        t1.channel = 7;	// channel 값을 7로 한다.
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        Tv[] tvArr = new Tv[3]; // 길이가 3인 Tv객체 배열

        for(int i=0; i < tvArr.length;i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i+10;
        }

        for(int i=0; i < tvArr.length;i++) {
            tvArr[i].channelUp();  // tvArr[i]의 메서드를 호출. 채널이 1증가
            System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
        }
    }
}
