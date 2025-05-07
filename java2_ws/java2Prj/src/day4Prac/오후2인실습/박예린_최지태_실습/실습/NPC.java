package day4prac.실습;

import java.util.Scanner;

public interface NPC {
    static boolean talk(String q, String a1, String a2, String a3) {
        Scanner sc = new Scanner(System.in);

        System.out.println(q);
        System.out.println("4. 뒤로가기");
        int user = sc.nextInt();

        switch (user) {
            case 1:
                System.out.println(a1);
                return false;
            case 2:
                System.out.println(a2);
                return false;
            case 3:
                System.out.println(a3);
                return false;
            case 4:
                return true;
            default:
                System.out.println("입력이 잘못됐습니다. 다시 입력해주세요.");
                return false;
        }
    }
}
