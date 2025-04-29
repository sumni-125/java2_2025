package day3Prac.오후실습.이동우_실습;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CustomerMain {

	public static void main(String[] args) {
		
		
		ArrayList<Customer> list = new ArrayList<>();

		list.add(new Customer("user1", "홍길동", "vvip", 15000));
		list.add(new Customer("user2", "김철수", "vip", 12000));
		list.add(new Customer("user3", "이영희", "bronze", 5000));
		list.add(new Customer("user4", "박민수", "vvip", 20000));
		list.add(new Customer("user5", "최수진", "vip", 11000));
		list.add(new Customer("user6", "한지민", "bronze", 4000));
		list.add(new Customer("user7", "장도연", "vvip", 18000));
		list.add(new Customer("user8", "정우성", "vip", 13000));
		list.add(new Customer("user9", "배수지", "bronze", 3000));
	    list.add(new Customer("user10", "손흥민", "vvip", 25000));
	    
	    
	    System.out.println("스트림으로 얻어와서 출력하기");
	    Stream<Customer> stream = list.stream();
	    stream.forEach(item -> System.out.println(item));
	    
	    
	    System.out.println("등급이 vvip인 사람만 출력하기");
	    stream = list.stream();
	    long result = stream.filter(item -> item.getGrade().equals("vvip")).count();
	    System.out.println(result);
	    
	    System.out.println("등급이 vip인 사람만 출력하기");
	    stream = list.stream();
	    long result2 = stream.filter(item -> item.getGrade().equals("vip")).count();
	    System.out.println(result2);
	    
	    System.out.println("포인트가 높은 순으로 정렬하기");
	    stream = list.stream();
	    stream.sorted((o1, o2) -> o2.getPoint() - o1.getPoint()).forEach(item -> System.out.println(item));
	    
	}
	
    
    
    
    
    
}
