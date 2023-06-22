package assignments;

public class prblm2 {

	public static void main(String[] args) {
		// Even Numbers
		
		int i=0;
		while(i<=50) {
			System.out.println(i);
			i+=2;
		}
		
//		another method
		System.out.println("\nusing another method:");
		i=0;
		while(i<=50) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
