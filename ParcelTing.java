import java.util.Scanner;
import java.util.ArrayList;
public class ParcelTing {
	
	public static void main(String[] args) {
		 
		//Declaring all the numbers which needs to be printed
		int numRejected = 0;
		int numAccepted = 0;
		double totalWeight = 0;
		double totalCost = 0;

		//Ask how many parcels there are to create array 
		Scanner parcelNumRead = new Scanner(System.in);
		System.out.println("Enter the number of parcels");
		int parcelNum = parcelNumRead.nextInt();
		
		//Making an array to store the prices
			ArrayList<String> parcelsPrices = new ArrayList<String>();
		
		
		//Entering the values for the list 
		for (int i=0;i<parcelNum;i++) {
			//Parcel currently is accepted, guideline are printed out
			boolean rejected = false;
			System.out.println("The sum of all legths has to be less than 200cm");
			System.out.println("Each length has to be less than 80cm");	
			
			//Enter the height and validate it 
			Scanner heightRead = new Scanner(System.in);
			System.out.println("Enter the height");
			double height = heightRead.nextDouble();
			System.out.println("The height of the parcel is "+height+" cm.");
			if (height>80) {
				System.out.println("The height of the parcel length is over 80cm");
				rejected = true;
				numRejected +=1;
				parcelNum+=1;
				i++; 
				}
			
			else {
				//Enter the width and validate it 
				Scanner widthRead = new Scanner(System.in);
				System.out.println("Enter the width");
				double width = widthRead.nextDouble();
				System.out.println("The width of the parcel is "+width+" cm.");
				if (width>80) {
					System.out.println("The width of the parcel length is over 80cm");
					rejected = true;
					numRejected +=1;
					parcelNum+=1;
					i++;
					}
				else {	
					//Enter length and validate it 
					Scanner lengthRead = new Scanner(System.in);
					System.out.println("Enter the length");
					double length = lengthRead.nextDouble();
					System.out.println("The length of the parcel is "+length+" cm.");
					if (length>80) {
						System.out.println("The length of the parcel length is over 80cm");
						rejected = true;
						numRejected +=1;
						parcelNum+=1;
						i++;
						}
					else {	
						//Enter the weight and validate it 
						Scanner weightRead = new Scanner(System.in);
						System.out.println("Enter the weight");
						double weight = weightRead.nextDouble();
						System.out.println("The weight of the parcel is "+weight+" kg.");
						boolean w = (weight<1||weight>10);
						if (w = false) {
							System.out.println("The weight of the parcel length is over 10kg or under 1kg");
							rejected = true;
							numRejected +=1;
							parcelNum+=1;
							i++;
							}
						else {
							
							//Add the sum together to validate it 
							double sum = (length+width+height);
							if (sum>200) {
								System.out.println("The sum of the parcel length are over 200cm");
								rejected = true;
								numRejected +=1;
								parcelNum+=1;
								i++;
								}
							else { 	
								//Finding the cost for the parcel
								double cost = 0;
								if (weight >=1 && weight <=5) {
									cost +=10;
								}
								else {
									cost+=10;
									double weightRemain = weight - 5;
									cost+=weightRemain;
								}
									
									
									
								//If the parcel qualifies
								numAccepted+=1;
								totalWeight +=weight;
								totalCost+=cost;
									
								//Adding the cost to the array 
								String cost2 = String.valueOf(cost);
								parcelsPrices.add(cost2); 
							
							}
						}		
					}
				}
			}
		}
			
		//Printing out everything which needs to be printed
		System.out.println("The numbers of rejected parcels are "+numRejected);
		System.out.println("The numbers of accepted parcels are "+numAccepted);
		System.out.println("The total price of every parcels are $"+totalCost);
		System.out.println("The list of parcel prices are "+parcelsPrices);
		}	
		
}
						