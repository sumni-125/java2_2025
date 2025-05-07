package day4Pracc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class 가게2 {
	점원 점원;
	
	
	public void set점원(점원 점원) {
		this.점원 = 점원;
	}

	public void run() {
		System.out.println("어서오세요~ 에이콘서점입니다~");
		System.out.println("동작을 선택하세요. : ");
		
		//Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();
		점원.인사하기();
		점원.진열하기();
		점원.판매하기();
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		;
		
		
		Properties properties = new Properties();
		properties.load(new FileReader("src/day4Pracc/config.txt"));
		String key = (String)properties.get("점원");
		
		Class clazz = Class.forName(key);
		점원   clerk=(점원) clazz.getDeclaredConstructor().newInstance();
		
		
		가게2 가게 = new 가게2();
		가게.set점원( clerk);
		가게.run();
		/*
		박수경 박수경 = new 박수경();
		박수경.인사하기();
		박수경.진열하기();
		박수경.판매하기();
		*/
	}

}
