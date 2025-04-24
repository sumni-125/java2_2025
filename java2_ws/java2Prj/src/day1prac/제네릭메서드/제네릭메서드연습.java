package day1prac.제네릭메서드;

public class 제네릭메서드연습 {
	public static int choiceint(int a, int b) {
		double r = Math.random();

		return r > 0.5 ? a : b;
	}

	public static String choiceString(String a, String b) {
		double r = Math.random();

		return r > 0.5 ? a : b;
	}

	public static boolean choiceBoolean(boolean a, boolean b) {
		double r = Math.random();

		return r > 0.5 ? a : b;
	}
}
