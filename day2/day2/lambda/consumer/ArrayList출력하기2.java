package day2.lambda.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrayList출력하기2 {

	public static void main(String[] args) {
		
		
		ArrayList<Acorn> list  = new ArrayList<>();
		
		
		list.add( new Acorn( "acorn1", "0000", "권지언"));
		list.add( new Acorn( "acorn2", "1234", "이동우"));
		list.add( new Acorn( "acorn3", "3456", "오윤석"));
		list.add( new Acorn( "acorn4", "1234", "윤현기"));
		list.add( new Acorn( "acorn5", "5678", "임형택"));
		list.add( new Acorn( "acorn6", "1090", "이수민"));
		list.add( new Acorn( "acorn7", "0000", "박수경"));
		list.add( new Acorn( "acorn8", "0000", "김유민"));
		list.add( new Acorn( "acorn9", "1234", "김민환"));
		
		

		//인터페이스를 익명으로 구현
		//Consumer< ? super Acorn>  의 의미
		//<> 제네릭타입에 올  수 있는 타입이 Acorn과 그 부모들 
		//Consumer<Acorn>   => ok
		//Consumer<Object>  => ok 
		
		
		
		System.out.println("for each  반복하기1");
		list.forEach( new Consumer<Object>() {

			@Override
			public void accept(Object t) {
				 System.out.println( t  +"^_____^");
				
			}

		  });
		
		// Acorn   => Object로 다루어도 문제가 되지 않는다 .  toStirng 매서드  오버라이드되어야 한다
		
		System.out.println("for each  반복하기2");
		list.forEach( new Consumer<Acorn>() {

			@Override
			public void accept(Acorn t) {
				 System.out.println( t  +"^_____^");
				
			} });
 
	}
	
}
