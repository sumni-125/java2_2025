package day4Prac.변경에유리한코드;

public class Main3 {

	public static void main(String[] args) {
		//Dog객체 두개 만들기
		
		Animal d1 = new Dog();
		d1.bark();
		
		Animal d2 = new Dog();
		d2.bark();
		
		//Dog -> Cat로 바꾸기
		
	}
	//객체를 얻어오는 부분을 매서드로 만들기
	
	private static Animal getAnimal() {
		
		return new Cat();
	}
	
}
