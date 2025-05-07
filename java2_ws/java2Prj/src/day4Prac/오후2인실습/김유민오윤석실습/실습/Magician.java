package day4.prac.실습;

public class Magician implements Job {

	@Override
	public String use(String skillName1, String skillName2) {
		System.out.println("마법사가 사용하는 스킬은 ");
		return skillName1 + skillName2;
	}

//	public static void main(String[] args) {
//
//		Magician m = new Magician();
//		m.use("불 내뿜기", "화염 방사");
//	}
}
