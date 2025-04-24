package day1prac.제네릭메서드;

public class PrintExGMain {
	public static void main(String[] args) {
		PrintExG.<Integer>print(10);
		PrintExG.<Acorn>print(new Acorn("ddd","ddd",123));
		PrintExG.<String>print("문자열");
	}
}
