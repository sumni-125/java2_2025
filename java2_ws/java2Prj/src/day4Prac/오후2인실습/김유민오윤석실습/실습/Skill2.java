package day4.prac.실습;

import java.util.Scanner;

public class Skill2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String skillName1, skillName2;

		System.out.println("마법사의 스킬을 입력하세요");
		skillName1 = sc.nextLine();
		skillName2 = sc.nextLine();

		Magician m = new Magician();
		m.use(skillName1, skillName2);

//		System.out.println(skill);
		System.out.println(skillName1 + "와(과) " + skillName2 + "을(를) 사용한다");
	}

}
