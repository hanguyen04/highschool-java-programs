import java.util.Arrays;
import java.util.Scanner;

public class circlingCue {
	
	public static void add (int [] a, int count, int tail, int x) {
		if (count==a.length) {
			System.out.println("Full");
		} else {
			a[tail] = x;
			tail=(tail+1)%a.length; 
			count ++;
			System.out.println(Arrays.toString(a));
		}
	}
	
	public static void remove (int [] a, int count, int head) {
		if (count==0) {
			System.out.println("Empty");
		} else {
			System.out.println(a[head]);
			a[head] = 0;
			head=(head+1)%a.length; 
			System.out.println(head);
			count --;
			System.out.println(count);
			System.out.println(Arrays.toString(a));
		}
	}
	
	public static void main(String[] args) {
		int [] array = {4,5,7,6,5};
		int head = 0; 
		int tail = 4; 
		int count = array.length; 
		int n = 0;
		while (true) {
			System.out.println("Enter to 1 add, 2 to remove, 3 to end the code");
			Scanner input = new Scanner (System.in);
			n = input.nextInt(); 
			
			if (n==1) {
				System.out.println("Enter the number you want to add");
				input = new Scanner (System.in); 
				int num = input.nextInt();
				add (array, count, tail, num);
			}
			else if (n==2) {
				remove (array, count, head);
			}
			else if (n==3) {
				break; 
			}
			else 
				break; 
			}
		 
	}

}
