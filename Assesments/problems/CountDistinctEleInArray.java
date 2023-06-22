package problems;

public class CountDistinctEleInArray {

	public static void main(String[] args) {
		
//		int[] arr = {12,34,55,54,34,13,78,45,76,55,45};
		int[] arr = {12,3,12,78,98,45};
		
		
		int count = 0;
		int temp = 0;
		
		for(int n:arr) {
			temp=0;
			for(int m:arr) {
				if(n==m) {
					temp++;
				}
			}
			if(temp<2) {
				count++;
			}
		}
		System.out.println(count);
	}
}
