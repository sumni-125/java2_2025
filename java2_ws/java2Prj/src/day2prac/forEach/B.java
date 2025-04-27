package day2prac.forEach;

import java.util.function.Consumer;

public class B implements Consumer{

	@Override
	public void accept(Object t) {
		String s = (String) t;
		
		System.out.println(s);
	}

}
