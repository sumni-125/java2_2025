package day3Prac.오후실습.권지언_실습;

import java.util.ArrayList;
import java.util.stream.Stream;

public class PrintCustomer {

	public static void main(String[] args) {

		ArrayList<Customer> list = new ArrayList<>();
		Stream<Customer> stream = list.stream();

		list.add(new Customer("C001", "Elma", "Gold", 1500));
		list.add(new Customer("C002", "Amy", "Silver", 1200));
		list.add(new Customer("C003", "Noel", "Bronze", 800));
		list.add(new Customer("C004", "David", "Gold", 2000));
		list.add(new Customer("C005", "Kenshi", "Silver", 950));
		list.add(new Customer("C006", "Yujin", "Bronze", 700));
		list.add(new Customer("C007", "Isabela", "Gold", 1800));
		list.add(new Customer("C008", "Hinata", "Silver", 1100));
		list.add(new Customer("C009", "Kageyama", "Bronze", 600));
		list.add(new Customer("C010", "Tacica", "Gold", 2200));

		// 1. 고객등급이 Gold 사람이 몇명인지
		stream = list.stream();
		long cntgold = stream.filter(item -> item.getGrade().equals("Gold")).count();
		System.out.println("고객등급이 Gold인 사람 수 : " + cntgold + "명\n");

		// 2. 고객등급이 Silver 사람만 출력
		stream = list.stream();
		System.out.println("고객등급이 Silver인 사람");
		stream.filter(item -> item.getGrade().equals("Silver")).forEach(item -> System.out.println(item));
		System.out.println();

		// 3. 포인트가 높은 사람순으로 정렬해서 출력
		stream = list.stream();
		System.out.println("포인트가 높은 사람 순서");
		stream.sorted((o1, o2) -> o2.getPoint() - o1.getPoint()).forEach(item -> System.out.println(item));

		
	}

}
