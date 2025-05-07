package day4prac.실습;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("만나고 싶은 NPC를 선택하세요:");
            System.out.println("1. 정중한 마을 주민");
            System.out.println("2. 조용한 마을 주민");
            System.out.println("3. 활발한 마을 주민");
            System.out.println("4. 진지한 마을 주민");
            System.out.println("5. 인공지능");
            System.out.println("6. 프로그램 종료");
            System.out.print("번호 입력: ");
            
            int choice = sc.nextInt();
            sc.nextLine();

            String className = null;

            switch (choice) {
                case 1:
                    className = "day4prac.실습.A";
                    break;
                case 2:
                    className = "day4prac.실습.B";
                    break;
                case 3:
                    className = "day4prac.실습.C";
                    break;
                case 4:
                    className = "day4prac.실습.D";
                    break;
                case 5:
                    className = "day4prac.실습.E";
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.\n");
                    continue;
            }

            try {
                Class<?> clazz = Class.forName(className);
                Object npc = clazz.getDeclaredConstructor().newInstance();
                Method method = clazz.getDeclaredMethod("talking");
                
                boolean isBack = (boolean) method.invoke(npc);

                if (!isBack) {
                    System.out.println("다음: Enter");
                    sc.nextLine();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
