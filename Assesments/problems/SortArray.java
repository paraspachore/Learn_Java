package problems;

public class SortArray {
	
	public static void main(String[] args) {
		
		int[] arr = {3,5,7,9,2,6,1};
		int temp = 0;
		
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr.length-1; j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int x:arr) {
			System.out.println(x);
		}

	}

}

//		for(int i:arr) {
//			for(int j:arr) {
//				if(i>j) {
//					temp = i;
//					i = j;
//					j = temp;
////					i = i + j; //i=10+j=20 i=30
////					j = i - j; //30-20 j=10
////					i = i - j; //30-10 i=20
//				}
//			}
//		}