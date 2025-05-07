package day4Prac.실습2인;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.Scanner;

public class Main {
	
	Calculator cal;
	static Scanner scan = new Scanner(System.in);

	public void setCal(Calculator cal) {
		this.cal = cal;
	}

	public void run() {
		System.out.print("첫번째 수를 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 수를 입력하세요 : ");
		int num2 = scan.nextInt();
		
		int result = cal.cal(num1, num2);
		System.out.println("결과 : " + result);
	}


	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Properties pro = new Properties();
		pro.load(new FileReader("src/day4Prac/개인실습/config.txt"));
		
		System.out.print("[1.Add, 2.Minus, 3.Multi, 4.Divide] : ");
		String key = scan.next();
		String name = (String) pro.get(key);
		
		Class clazz = Class.forName(name);
		Calculator cal = (Calculator) clazz.getDeclaredConstructor().newInstance();
		
		Main m = new Main();
		m.setCal(cal);
		m.run();

	}

}
