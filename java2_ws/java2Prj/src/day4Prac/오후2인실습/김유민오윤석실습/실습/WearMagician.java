package day4.prac.실습;

public class WearMagician implements Clothe{

	@Override
	public String wear(String hat, String top, String bottom) {
		System.out.println("마법사의 장비는 ");
		return hat + top + bottom;
	}

}
