package j0114;

public class IfOper_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 8;
		String grade;

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else {
			grade = "D";
		}

		System.out.println("학점은" + grade);
		
		
		grade = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : "D";
		System.out.println("학점은" + grade);
		

		switch (score / 10) {
			case 10 :
			case 9 :
				grade = "A";
				break;
			case 8 :
				grade = "B";
				break;
			case 7 :
				grade = "C";
				break;
			default :
				grade = "D";

		}
		System.out.println("학점은" + grade);

	}

}
