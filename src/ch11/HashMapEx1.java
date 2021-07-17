package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "123");
        map.put("asdf", "123");
        map.put("asdf", "1234");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("id: ");
            String id = scanner.nextLine().trim();

            System.out.printf("password: ");
            String password = scanner.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
            } else {
                if(!(map.get(id)).equals(password)) {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                } else {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                }
            }
        }
    }
}
