import java.util.Random;
import java.util.Scanner;
public class caseygotcake {
	
 
	public static void main(String[] args) {
	int counter = 0;
	
	int n = 0 ; 
	int a = 0 ; 
	
	//generate first random number 
	Random rand1 = new Random();
	int random1 = rand1.nextInt(20);
	while (random1 == 0) { //generate different number if it's 0
		random1 = rand1.nextInt(20);
	}
	
	
	while (true) {
		
		//second number
		Random rand2 = new Random(); 
		int random2 = rand2.nextInt(21);
		while (random2 == 0) {
			random2 = rand2.nextInt(21);
		}
		
		//user input and to lower case for comparison
		System.out.println(random1); 
		System.out.println("Higher or Lower?"); 
		Scanner inputScan = new Scanner (System.in);
		
		String input = inputScan.nextLine(); 
		String highOrlow = input.toLowerCase();
		
		//compare the two numbers to give value for if statement
		if (random1 > random2) {
			 n=1;
		}
		if (random2 > random1) {
			 n=2;
		}
		
		//this number is the opposite to given value
		if (highOrlow.equals("lower")) { 
			a=2;
		} 
		if (highOrlow.equals("higher")) { 
			a=1;
		}
		
		//if values are the same the number is the opposite value 
		if (a==n) { 
			System.out.println("haha you lose");
			System.out.println("the number was:");
			System.out.println(random2);
			break;
		} 
		
		//if t
		counter++;
		if (counter==5) {
			System.out.println("wow u actually won mate");
			break;
		}
		
		random1 = random2;
	
		
	}

	}

}
