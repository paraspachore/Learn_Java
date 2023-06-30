package arrayListEx;

import java.util.Arrays;

public class HighestBid {

	public static void main(String[] args) {
		
		double[] bids = {223.34, 222.34, 223.45};
		
		double highestBid = Arrays.stream(bids).max().orElse(0);
		
		System.out.println(highestBid);

	}

}
