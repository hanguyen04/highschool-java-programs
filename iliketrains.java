import java.util.Scanner;

public class iliketrains {
	
	public static void display(int [] t, int [] p, int [] sL, int [] mM) {
		
		System.out.println("The time:");
		for (int i=0; i<8; i++) {
			System.out.println(t[i]);
		}
		System.out.println("The number of passengers are: ");
		for (int i=0; i<8; i++) {
			System.out.println(p[i]);
		}
		System.out.println("The number of seats left are");
		for (int i=0; i<8; i++) {
			System.out.println(sL[i]);
		}
		System.out.println("The number of money made is");
		for (int i=0; i<8; i++) {
			System.out.println(mM[i]);
		}
	}
	
	public static void purchaseTicket (int [] t, int [] p, int [] sL, int [] mM) {
		int ticketNum = 1000;
		int timeLeaving = 0;
		int timeReturning = 0;
		
		while (ticketNum > sL[timeLeaving] || ticketNum > sL[timeReturning]) {
			System.out.println("How many tickets do you want to purchase?");
			Scanner input = new Scanner (System.in); 
			ticketNum = input.nextInt(); 
			
			//LEAVING 
			System.out.println("When are you leaving? \n Enter 0 for 9:00, 1 for 11:00, 2 for 13:00, 3 for 14:00 ");
			input = new Scanner (System.in); 
			timeLeaving = input.nextInt(); 
			while (timeLeaving > 3) {
				System.out.println("When are you leaving? \n Enter 0 for 9:00, 1 for 11:00, 2 for 13:00, 3 for 14:00 ");
				input = new Scanner (System.in); 
				timeLeaving = input.nextInt(); 
			}
			
			//RETURNING
			System.out.println("When are you returning? \n Enter 4 for 10:00, 5 for 12:00, 6 for 14:00, 7 for 16:00 ");
			input = new Scanner (System.in); 
			timeReturning = input.nextInt(); 
			while (timeReturning > 7|| timeReturning < 4||(timeReturning-4) < timeLeaving) {
				System.out.println("When are you returning? \n Enter 4 for 10:00, 5 for 12:00, 6 for 14:00, 7 for 16:00");
				input = new Scanner (System.in); 
				timeReturning = input.nextInt(); 
			}
		}
		
		//increase the number of passengers and decreasing the number of sears left 
		p[timeLeaving] = p[timeLeaving] + ticketNum; 
		p[timeReturning] = p[timeReturning] + ticketNum; 
		sL[timeLeaving] = sL[timeLeaving] - ticketNum; 
		sL[timeReturning] = sL[timeReturning] - ticketNum; 
		
		//calculate the number of free tickets, get the cost to print and update arrays
		
		int freeTicket = 0; 
		if (ticketNum > 80) {
			freeTicket = 8; 
		} else {
			freeTicket = ticketNum%10; 
		}
		int costLeaving = ticketNum*25; 
		int costReturning = ticketNum*25;
		mM[timeLeaving] = mM[timeLeaving] + costLeaving; 
		mM[timeReturning] = mM[timeReturning] + costReturning; 
		int total = costReturning + costLeaving; 
		System.out.println("The total amout you have to pay is: " + total);
	}
	
	
	public static void endOfDay (int [] t, int [] p, int [] sL, int [] mM) {
		display(t, p, sL, mM);
		int totalPassenger = 0;
		int totalCost = 0;
		int highestPassenger = 0; 
		int highestCost = 0; 
		int highestPassengerTrain = 0; 
		int highestCostTrain = 0; 
		
		for (int i=0; i<8; i++) {
			totalPassenger = totalPassenger + p[i];
			totalCost = totalCost + mM[i]; 
			//which train has the most passenger
			if (p[i] > highestPassenger) {
				highestPassenger = p[i]; 
				highestPassengerTrain = i; 
			}
			//which train made the most money
			if (mM[i] > highestCost) {
				highestCost = mM[i]; 
				highestPassengerTrain = i; 
			}
		}
		
		System.out.println("The train which made the most money was the train at " +t[highestCostTrain]+ " making " +highestCost);
		System.out.println("The train which had the most passenger was the train at " +t[highestPassengerTrain]+ " which had " +highestPassenger + " passengers");
		
	}
	
	public static void main(String[] args) {
		int [] time = {9, 11, 13, 15, 10, 12, 14, 16}; 
		int [] passengers = {0, 0, 0, 0, 0, 0, 0, 0};
		int [] seatsLeft = {480, 480, 480, 480, 480, 480, 480, 640};
		int [] moneyMade = {0, 0, 0, 0, 0, 0, 0, 0}; 
		
		int n = 0;
		while (true) {
			System.out.println("Enter 1 to display eveything, 2 to purchase a ticket, 3 for the end of day");
			Scanner input = new Scanner (System.in);
			n = input.nextInt(); 
			
			if (n==1) {
				display(time, passengers, seatsLeft, moneyMade);
			}
			else if (n==2) {
				purchaseTicket (time, passengers, seatsLeft, moneyMade); 
			}
			else if (n==3) {
				endOfDay (time, passengers, seatsLeft, moneyMade); 
				break; 
			}
			else 
				break; 
			}
			
		}
		
	}
	


