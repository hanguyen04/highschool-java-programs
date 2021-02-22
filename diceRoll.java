
import java.util.Scanner;
import java.util.Random;


public class diceRoll {

	public diceRoll (int rolls) { //name of public same as class to be called
		diceRolling(rolls); //another method to execute the actual code
	}
	
	public diceRoll () {
		diceRolling(10);
	}
	
	public void diceRolling (int times) { 
		int dice1; 
		int dice2; 
		Random r1 = new Random();
		int doubleDice = 0;                               
		
		for (int i = 0; i<times; i++) {
			dice1 = r1.nextInt(5)+1; 
			dice2 = r1.nextInt(5)+1; 
			
			if (dice1==dice2) {
				doubleDice += 1; 
			}
			System.out.println("rolled "+dice1+", "+dice2);
		}  
		
		System.out.println("The number of doubles: "+doubleDice);
	}
	

	public static void main(String[] args) {
		System.out.println("Please enter the number of rolls"); 
		Scanner input = new Scanner (System.in);
		int rolls = input.nextInt();
		diceRoll rolls1 = new diceRoll(rolls); //create a new object in this class
		diceRoll rolls2 = new diceRoll();
	}

}
