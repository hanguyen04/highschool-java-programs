import java.util.Scanner;
import java.util.Arrays;

public class GradeCalc {
	
	public static int above = 0;
	public static int equal = 0;
	public static int below = 0;
	public static String [] grades = new String [] {"A*","A","B","C","D","E","F","G","U"};
	public static int [] scoresPercentages = new int [10];
	public static int [] gradeBounds = new int [9];
	public static String [] studentsGrades = new String [10];
	
	public static boolean intCheck(String i) {
		try {
			Integer.parseInt(i);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static String reEnter() {
			System.out.println("Please re-enter the lower grade boundary"); 
			Scanner input2 = new Scanner (System.in);
			String bound = input2.nextLine();	
			return bound;
	}
	
	public static boolean numCheck (int input) {
		if (input<0||input>100) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static int lowerGradeBoundaries (int l){
		System.out.println("Enter the lower grade boundary"); 
		Scanner input = new Scanner (System.in);
		String bound = input.nextLine();
		
		Checking: 
		while (true) {
			if (intCheck(bound)) {
				int bound2 = Integer.parseInt(bound);
				if (numCheck(bound2)) {
					break Checking;
				}
				else {
					bound = reEnter();
				}
			}
			else {
				bound = reEnter();
			}		
		}
		
		int bound2 = Integer.parseInt(bound);
		
		if (l>0) {
			for (int i = 0; i<l; i++) {
				while (bound2>gradeBounds[i]) {
					System.out.println("Please re-enter the lower grade boundary"); 
					Scanner input2 = new Scanner (System.in);
					bound2 = input2.nextInt();	
				}
			}
		}
		return bound2;
	}
	
	public static int studentsGrades (){
		System.out.println("Enter the student's grade percentage (without percentage sign)"); 
		Scanner input = new Scanner (System.in);
		String grade = input.nextLine();
		Checking: 
			while (true) {
				if (intCheck(grade)) {
					int grade2 = Integer.parseInt(grade);
					if (numCheck(grade2)) {
						break Checking;
					}
					else {
						grade = reEnter();
					}
				}
				else {
					grade = reEnter();
				}		
			}
			
		int grade2 = Integer.parseInt(grade);
		return grade2;
	}
	
	public static String findingBoundary (String m) {
		int i=Integer.parseInt(m); 
		int score = 0;
		score = scoresPercentages[i];
		for (int j=0;j<9;j++) {
			if (score>=gradeBounds[j]) {
				return grades[j]; 
			}
		}
		return ("unvailable");
		
	}
	
	public static int findingAverage (int n) {
		return n/10;
	}
	
	public static void belowAboveOrEqual (int avg, int score)  {
		if (score > avg) {
			above+=1; //above avg
		}
		else if (score < avg) {
			below+=1; //below avg
		}
		else {
			equal+=1; //equal
		}
	}
	
	
	public static void main(String[] args) {
		
		 int total = 0;

		 for (int i = 0; i<9 ;i++) { //enter grade boundaries 
			 System.out.println("Grade: " + grades[i]);
			 gradeBounds[i]= lowerGradeBoundaries(i);
		 }
		 
		 for (int i = 0; i<10 ;i++) { 
			 System.out.println("Student " + (i+1));
			 scoresPercentages[i]= studentsGrades();
		 }
		 
		 for (int i = 0; i<10 ;i++) {
			 String m = String.valueOf(i);
			 studentsGrades[i]=findingBoundary(m);
		 }
		 
		 for (int i = 0; i<10 ;i++) {  
			 total += scoresPercentages[i]; 
		 }
		 
		 int average = 0;
		 average = findingAverage(total);
		 
		
		 for (int i = 0; i<10 ;i++) { 
			 int num =0;
			 belowAboveOrEqual (average,scoresPercentages[i]);	
		 }
		 
		 System.out.println("The percentages are: " + Arrays.toString(scoresPercentages));
		 System.out.println("The student's grades are: " + Arrays.toString(studentsGrades));
		 System.out.println("The average percentage/score is: " + average);
		 System.out.println("The number of students below average: " + below);
		 System.out.println("The number of students who are average: " + equal);
		 System.out.println("The number of students above average: " + above);
		 
	}
	
}
