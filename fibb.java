import java.util.Scanner;
		
public class fibb {
	
	public static int fib(int n) {
		if (n<2) {
			return n; 
		}
		else {
			return fib(n-1)+fib(n-2);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter an nth term for fibonaci sequence"); 
		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		int fibo = fib(number);
		System.out.println(fibo);
	}

}
