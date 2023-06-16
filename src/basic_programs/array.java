package basic_programs;

public class array {

	public static void main(String[] args) {
		System.out.println("Defining and traversing an array");

		int[] arr = new int[5];
		arr[0]=100;
		arr[3]=400;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("\nAdvance for loop OR Array traversing");
		int[] arr1 = { 100, 200, 300, 400, 500 };
		for (int i : arr1) {
			System.out.println(i);
		}
	}
}
