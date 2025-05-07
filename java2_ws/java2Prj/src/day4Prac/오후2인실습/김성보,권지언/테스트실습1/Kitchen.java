package day4Prac.테스트실습1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Kitchen {

	Cooking cooking;

	public void setFood(Cooking cooking) {
		this.cooking = cooking;
	}

	public void run() throws Exception {
		System.out.println("요리 시작");
		Scanner sc = new Scanner(System.in);
		System.out.println("요리를 선택하세요 1.김밥 2.라면 3.불고기");
		int num = sc.nextInt();
		
		String foodClassName = "";
		switch (num) {
		case 1:
			foodClassName = "day4Prac.테스트실습1.Kimbab";
			break;
		case 2:
			foodClassName = "day4Prac.테스트실습1.Ramen";
			break;
		case 3:
			foodClassName = "day4Prac.테스트실습1.Bulgogi";
			break;
		default:
			System.out.println("잘못된 선택입니다.");
			return;
		}
		FileWriter fw = new FileWriter("src/day4Prac/테스트실습1/cooking.txt");
		fw.write("foodname=" + foodClassName);
		fw.close();

		Properties p = new Properties();
		p.load(new FileReader("src/day4Prac/테스트실습1/cooking.txt"));
		String name = (String) p.get("foodname");

		Class clazz = Class.forName(name);
		Cooking cooking = (Cooking) clazz.getDeclaredConstructor().newInstance();

		cooking.cook(num);
	}

	public static void main(String[] args) throws Exception {
		Kitchen k = new Kitchen();
		k.run();
	}
}
