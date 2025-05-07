package day4.prac.실습;

import java.util.Scanner;

public class Wear1 {
	
	
	public void wear() {
		Scanner sc = new Scanner(System.in);
		String hat, top, bottom;
		
		System.out.println("전사의 모자를 골라주세요");
		hat = sc.nextLine();
		System.out.println("전사의 상의를 골라주세요");
		top = sc.nextLine();
		System.out.println("전사의 바지를 골라주세요");
		bottom = sc.nextLine();
		
		System.out.println("전사의 장비는 "+hat+" "+top+" "+bottom+" 입니다");
	}
	
	public static void main(String[] args) {
		
		Wear1 w = new Wear1();
		w.wear();
	}

}
