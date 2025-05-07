package day4.prac.실습;

public class WearWarrior implements Clothe{

	@Override
	public String wear(String hat, String top, String bottom) {
		return "모자: " + hat + ", 상의: " + top + ", 바지: " + bottom;
	}

}
