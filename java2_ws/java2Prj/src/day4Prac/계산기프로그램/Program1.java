package day4Prac.계산기프로그램;

import java.util.Scanner;

//계산기 프로그램
//사용자가 입력한 두 수를 더해주는 프로그램

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int su1, su2;
		
		System.out.println("두 수를 입력하면 계산합니다.");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		
		int total;
		total = su1+su2;
		
		System.out.println(total);
		
	}

}
