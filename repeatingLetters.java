
import java.util.Scanner;

public class repeatingLetters {
	
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner inputScan = new Scanner (System.in);
		String input = inputScan.nextLine(); 

		char[] ch = new char[input.length()];
		for (int i = 0; i < input.length(); i++) { 
	            ch[i] = input.charAt(i); 
	    } 
		Task:
		for (int x=1;x<input.length();x++) {
			for (int n=0;n<x;n++) {
				if (input.charAt(n)==input.charAt(x)) {
					System.out.println(input.charAt(x));
					break Task;
				}
			}
		}
	}	
}