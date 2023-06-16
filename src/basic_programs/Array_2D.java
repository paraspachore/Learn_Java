package basic_programs;

public class Array_2D {

	public static void main(String[] args) {
		
		int arr[][] = {{2,3,4},{4,6,8},{6,9,12},{8,12,16}};
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
//		To get the number of rows and number of columns
		
		System.out.println("\nNo. of rows : "+arr.length);
		System.out.println("No. of columns : "+arr[0].length);
		

	}

}
