package day4.prac.실습;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.Scanner;

public class InfoFinal {

	
	Clothe clothe;
	Job job;
	
	
	
	public void setClothe(Clothe clothe) {
		this.clothe = clothe;
	}



	public void setJob(Job job) {
		this.job = job;
	}
	
	public InfoFinal() {
		// TODO Auto-generated constructor stub
	}
	
	public void prinInfo() {
		Scanner sc = new Scanner(System.in);

		String hat, top, bottom;

		System.out.println("전사의 모자를 골라주세요:");
		hat = sc.nextLine();
		System.out.println("전사의 상의를 골라주세요:");
		top = sc.nextLine();
		System.out.println("전사의 바지를 골라주세요:");
		bottom = sc.nextLine();

		String skillName1, skillName2;

		System.out.println("전사의 첫 번째 스킬을 입력하세요:");
		skillName1 = sc.nextLine();
		System.out.println("전사의 두 번째 스킬을 입력하세요:");
		skillName2 = sc.nextLine();

		// 실제 인터페이스 메서드 호출
		String skillResult = job.use(skillName1, skillName2);
		String wearResult = clothe.wear(hat, top, bottom);

		System.out.println(skillResult + "을 사용하고, 장비는 " + wearResult + "이다.");
	}



	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Properties properties = new Properties();
		properties.load(new FileReader("src/day4/prac/실습/config.txt"));
		
		String name1 = (String) properties.get("Job");
		Class clazz1 = Class.forName(name1);
		Job job = (Job) clazz1.getDeclaredConstructor().newInstance();
		
		String name2 = (String) properties.getProperty("Clothe");
		Class clazz2 = Class.forName(name2);
		Clothe clothe = (Clothe) clazz2.getDeclaredConstructor().newInstance();
		
		InfoFinal info = new InfoFinal();
		info.setJob(job);
		info.setClothe(clothe);
		info.prinInfo();

	}

}
