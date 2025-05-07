package day4.prac.실습;

import java.util.Scanner;

public class Info2 {
	Clothe clothe;
	Job job;


	// 두 필드를 모두 받는 생성자
	public Info2(Clothe clothe, Job job) {
		this.clothe = clothe;
		this.job = job;

	}

	public void printInfo() {
		Scanner sc = new Scanner(System.in);

		String hat, top, bottom;

		System.out.println("마법사의 모자를 골라주세요:");
		hat = sc.nextLine();
		System.out.println("마법사의 상의를 골라주세요:");
		top = sc.nextLine();
		System.out.println("마법사의 바지를 골라주세요:");
		bottom = sc.nextLine();

		String skillName1, skillName2;

		System.out.println("마법사의 첫 번째 스킬을 입력하세요:");
		skillName1 = sc.nextLine();
		System.out.println("마법사의 두 번째 스킬을 입력하세요:");
		skillName2 = sc.nextLine();

		// 실제 인터페이스 메서드 호출
		String skillResult = job.use(skillName1, skillName2);
		String wearResult = clothe.wear(hat, top, bottom);

		System.out.println(skillResult + "을 사용하고, 장비는 " + wearResult + "이다.");
	}
	
	public static void main(String[] args) {
		Info2 info = new Info2(new WearMagician(), new Magician());
		info.printInfo();
	}
}
