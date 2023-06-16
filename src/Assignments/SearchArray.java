package Assignments;

public class SearchArray {

	public static void main(String[] args) {
		
		int n = 5;
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		boolean found = false;
		
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==5) {
				System.out.println("Value found at "+i+"th Index");
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Value not found");
		}
		
		
		System.out.println("----------------------------------------------------");
		
		
		
		found=false;
		for(int i:arr) {
			if(i==n) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("Value found");
		}else {
			System.out.println("Value not found");
		}
	}

}
