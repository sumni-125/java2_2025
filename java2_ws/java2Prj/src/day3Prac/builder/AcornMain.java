package day3Prac.builder;


public class AcornMain {

	public static void main(String[] args) {
		Acorn a = new Acorn.Builder()
				.id("test01")
				.pw("1234")
				.name("권지언")
				.point(2000)
				.build();
		
		System.out.println(a);
	}

}
