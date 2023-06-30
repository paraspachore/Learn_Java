package dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateTime {

	public static void main(String[] args) {
		while (true) {
			LocalDateTime currentDateTime = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String formattedDateTime = currentDateTime.format(formatter);
			System.out.println(formattedDateTime);
			try {
				Thread.sleep(1000);
				// Clear console by printing multiple empty lines
                for (int i = 0; i < 50; i++) {
                    System.out.println();
                }
				// Clear console
//				System.out.print("\033[H\033[2J");
//				System.out.flush();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
