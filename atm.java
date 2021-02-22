
import java.util.Scanner; 
public class atm {
	public static boolean checking = true; //continue checking loop
	public static int outputNum = 1; //using the same validation+enter code for both 
									//outputNum = 1 => "Enter Balance" 
									//outputNum = 2 => "Enter the takeout amount"
	
	public static boolean intCheck(String i) { //check for string
		try {
			Integer.parseInt(i);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static boolean parameterCheck (String i) { //check range
		int num = Integer.parseInt(i); 
		if (num<1||num>2000) {
			return false;
		}
		else {
			return true; 
		}
	}
	
	
	public static String enterAmount() { //user input
		if (outputNum == 1) {
			System.out.println("Enter the balance");
		} else {
			System.out.println("Enter the amout you want to take out");
		}
		
		Scanner input = new Scanner (System.in); 
		String amount = input.nextLine(); 
		return amount; 
	}
	
	private static String check(String amount) {
		if (intCheck(amount)) { //check string
			if (parameterCheck(amount)) {	//if it's int, check range
			} else {
				amount = enterAmount();
				return amount;
			}
		} else {
			amount = enterAmount();
			return amount;
		}		
		checking = false; 
		return amount;
	}
	
	public static void main(String[] args) {
		
		String balance = ""; 
		String takeout = ""; 
		
		while (checking) { //enter+validate balance
			balance = check(balance);	
		}
		
		checking = true; //because checking turned into false to stop the other loop, change to true again to check other variable
		outputNum = 2; //input change  
		while (checking) { //enter+validate takeout
			takeout = check(takeout);
		}
		
		int balanceInt=Integer.parseInt(balance); //turn into int
		int takeoutInt=Integer.parseInt(takeout);
		
		boolean divisibleByFive = true; 
		if (takeoutInt%5 != 0) { 
			divisibleByFive = false; 	
		}
		
		
		if (divisibleByFive&&takeoutInt<=balanceInt) { 
			balanceInt = balanceInt - takeoutInt;
			double balanceDouble = balanceInt - 0.5;
			System.out.println(takeoutInt + ", " + balanceDouble);
		} else {
			System.out.println(takeoutInt + ", " + balanceInt);
		}
		
	}

}
