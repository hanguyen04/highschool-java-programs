import java.util.Scanner;

public class factorial {
	
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner inputScan = new Scanner (System.in);
		int number = inputScan.nextInt();
		int f = fact(number);
		System.out.println(number+"! = "+f);
		
	}

}
