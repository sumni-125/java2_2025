package day1prac.정렬;

public class 정렬하기 {

	public static void main(String[] args) {

		// 선택정렬
		// int[] arr = new int[5];

		// int[] arr = {10,5,7,13,6};

		int[] arr = null;
		arr = new int[] { 10, 5, 7, 13, 6 };

		//
		for (int i = 0; i < arr.length - 1; i++) {// -1하는이유: 총 다섯개면 4개만 자리를 찾으면 되기 때문에
			// i: 기준
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		} // for

		// 정렬 후
		System.out.println("정렬 후");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
