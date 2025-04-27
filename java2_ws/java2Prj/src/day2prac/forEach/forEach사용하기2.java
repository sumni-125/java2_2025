package day2prac.forEach;

import java.util.ArrayList;
import java.util.function.Consumer;

public class forEach사용하기2 {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		names.add("윤현기");
		names.add("박예린");
		names.add("이정호");
		names.add("김민환");
		names.add("김유민");
		names.add("박수경");
		names.add("이수민");
		names.add("박시우");
		names.add("이동우");
		names.add("오윤석");
		names.add("정연수");
		names.add("최지태");
		names.add("김보성");
		names.add("임형택");
		names.add("최하은");
		names.add("황예지");

		names.forEach((item) -> {
			System.out.println(item);
		});

		names.forEach((a) -> {
			System.out.println(a);
		});

		names.forEach(bb -> System.out.println(bb));

		for (String s : names) {
			System.out.println(s);
		}

		// 1. 이름있는 클래스로 만들기
		// 2. 익명으로구현하기
		System.out.println("\nB\n");
		names.forEach(new B()); 	// B클래스 객체의 accept 메서드를 반복적으로 호출함 (size만큼 반복)
		//forEach 메서드 내부에 반복문이 있다.
		//반복하면서 리스트의 요소를 제공한다
		
		//Con
		System.out.println("\nA\n");
		names.forEach(new A());
		
		names.forEach(new Consumer() {

			@Override
			public void accept(Object t) {
				// TODO Auto-generated method stub
				
			}});
		
		
		//라이브러리를 사용할 떄
		//인터페이스를 구현하여 사용되느 메서드(라이브러리)를 사용할 수 있다
		
		//1) 이름 있는 크랠스
		//2) 익명클레스
		//3) 람다식 (구현할 약속(메서드)이 한개인 인터페이스 함수형인ㅌ터페이스)
		
	}

}
