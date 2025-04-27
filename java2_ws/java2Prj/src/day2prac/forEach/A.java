package day2prac.forEach;

import java.util.function.Consumer;

public class A implements Consumer<String>{

	@Override
	public void accept(String t) {
		
		System.out.println(t);
		
	}

}
