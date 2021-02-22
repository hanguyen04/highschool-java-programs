
public class loop {

	public static void main(String[] args) {
		int[] numbers = {3,5,10,4};
		String [] outputs = {"Fizz","Buzz","Bang","Boom"}; 
		
		for (int i=1;i<=100;i++) {
			String output = ""; 
			
			for (int n=0;n<numbers.length;n++) {
				if (i%numbers[n]==0) {
					output = output + outputs[n];
				}
			}
			
			if (output.equals("")) {
				System.out.println(i);
			}
			if (output!="") {
				System.out.println(output); 
			}
		}
	}
	
}
