package day1prac.정렬;

public class 변수교환하기 {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		System.out.println("a b "+a+" "+b);
		
		int t = a;
		a = b;
		b = t;
		
		System.out.println("a b "+a+" "+b);
		
	}
}
