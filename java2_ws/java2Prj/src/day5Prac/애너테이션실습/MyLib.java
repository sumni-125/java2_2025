package day5Prac.애너테이션실습;

public class MyLib {
	
	@Before(before="메서드 실행 시작 합니다 ========== ^^~")
	public void printStar() {
		System.out.println("***");
	}
	@Before
	public void printStar2(int num) {
		for(int i=0;i<num;i++) {
			System.out.print("*");
		}
	}
	
	
}
