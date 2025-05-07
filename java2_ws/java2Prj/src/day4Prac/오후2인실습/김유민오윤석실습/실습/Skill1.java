package day4.prac.실습;

import java.util.Scanner;

public class Skill1 {

	public void skill() {
		Scanner sc = new Scanner(System.in);
		String skillName1, skillName2;

		System.out.println("전사의 스킬을 입력하세요");
		skillName1 = sc.nextLine();
		skillName2 = sc.nextLine();

		Warrior w = new Warrior();
		w.use(skillName1, skillName2);

//		System.out.println(skill);
		System.out.println(skillName1 + "와(과) " + skillName2 + "을(를) 사용한다");
	}

	public static void main(String[] args) {
		
		Skill1 s = new Skill1();
		s.skill();

	}

}
