package conditionals;

public class GradeCard {

	public static void main(String[] args) {
		
		int marks = 85;
		
		char grade;
		if (marks>=90) {
			grade = 'A';
		} else if (marks>=80) {
			grade = 'B';
		} else if (marks>=70) {
			grade = 'C';
		} else if (marks>=60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("Student grade is: "+grade);
		
		switch(grade) {
		case 'A':
			System.out.println("Excellent performance");
			break;
		case 'B':
			System.out.println("Good performance");
			break;
		case 'C':
			System.out.println("Good score, You can do better");
			break;
		case 'D':
			System.out.println("poor performance, work hard");
			break;
		case 'F':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid Grade");
		}

	}

}
