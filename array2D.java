import java.util.Arrays;

public class array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]numbers = new int[11][11];
		
		for (int x = 0; x<11; x++) {
			for (int y = 0; y<11; y++) {
				numbers[x][y]=x*y;
			}
		}
		for (int i =0; i<11; i++) {
			System.out.println(Arrays.toString(numbers[i]));
		}
		int num1 = 5;
		int num2 = 7; 
		System.out.println(numbers[num1][num2]);
	}
}
