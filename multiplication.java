import java.util.Scanner;

public class multiplication {
	
	static int multi(int n, int m) {
		if (n==0||m==0) {
			return 0; 
		}
		//output for when either number equals 0
		if (n<0&&m<0||m<0) {
		//the code doesn't work for when m<0 so we have to change m to be >0
		//and if m > 0 we also have to change n to be the opposite for the
		//code to work
			n=-n;
			m=-m;
			return(n+multi(n,m-1));
		}
		else {
			return (n+multi(n,m-1));
			//it adds n to n in the amount of m (m-1 every time) 
		}	
	}
	
	public static void main(String[] args) {
		System.out.println("Enter two numbers for multiplication"); 
		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		Scanner input2 = new Scanner (System.in); 
		int number2 = input2.nextInt();
		int mul = multi(number,number2);
		System.out.println(mul);
		
	}
	
	}

