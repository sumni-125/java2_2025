package day4Prac.classPath;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.Scanner;


public class RecommendCity {

	CityRecommender cr; // 서울지역중에서 한 개

	public void setCr(CityRecommender cr) {
		this.cr = cr;
	}

	public void print() {
		String 지역 = cr.recommend();
		System.out.println(지역);
	}

	public static CityRecommender readFile(String region) throws FileNotFoundException, IOException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException, ClassNotFoundException {
		Properties p = new Properties();
		p.load(new FileReader("src/day4Prac/classPath/classPath.txt"));
		String name = (String) p.getProperty(region);

		Class clazz = Class.forName(name);
		CityRecommender cr = (CityRecommender) clazz.getDeclaredConstructor().newInstance();

		return cr;
	}

	public static void main(String[] args)
			throws FileNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, IOException {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("지역을 선택하세요 (1.서울, 2.부산, 3.종료)");
			int menu = sc.nextInt();
			CityRecommender cr = null;
			switch (menu) {
			case 1:
				cr = readFile("Seoul");
				System.out.println("추천 지역: " + cr.recommend());

				break;
			case 2:
				cr = readFile("Busan");
				System.out.println("추천 지역: " + cr.recommend());
				break;
			case 3:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("번호를 다시 입력하세요.");
			}
		}
	}
}
