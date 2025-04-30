package day5Prac.복습;

import java.util.ArrayList;
import java.util.List;

public class 흑요리사리스트 implements 요리사리스트 {

	@Override
	public List<String> getChefList() {
		
		List<String> list = new ArrayList<>();
		list.add("흑요리사1");
		list.add("흑요리사2");
		list.add("흑요리사3");
		
		return list;
	}

}
