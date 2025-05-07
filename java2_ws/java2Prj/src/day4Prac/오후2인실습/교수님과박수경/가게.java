package day4Pracc;

import java.util.Scanner;
import java.util.Set;

public class 가게 {
	점원 점원;
	
	
	public void set점원(점원 점원) {
		this.점원 = 점원;
	}

	public void run() {
		System.out.println("어서오세요~ 에이콘서점입니다~");
		System.out.println("동작을 선택하세요. : ");
		
		//Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();
		
		
		
		점원.인사하기();
		점원.진열하기();
		점원.판매하기();
		 
		
	
		
	}
	
	public static void main(String[] args) {
		
		가게 가게 = new 가게();
		가게.set점원(new 우주연점원());
		가게.run();
		
		
		/*
		박수경 박수경 = new 박수경();
		박수경.인사하기();
		박수경.진열하기();
		박수경.판매하기();
		*/
	}

}
