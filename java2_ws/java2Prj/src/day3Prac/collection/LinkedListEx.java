package day3Prac.collection;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList();
		
		
		list.add("사과");
		list.add("망고");
		list.add("참외");
		
		list.addFirst("오렌지");
		list.addLast("포도");
		
		for(String item: list) {
			System.out.println(item);
		}
		
		list.remove("사과");
		
		System.out.println("사과삭제후");
		
		for(String item: list) {
			System.out.println(item);
		}
		
		
	}

}
