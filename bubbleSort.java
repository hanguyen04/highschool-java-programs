
public class bubbleSort {
	
	public bubbleSort () {
		int[] arrayNums = {66, 13, 7, 67, 24, 113, 6, 89, 27, 38};
		//6, 7, 13, 24, 27, 38, 66, 67, 89, 113, 
		//66, 13, 7, 67, 24, 113, 6, 89, 27, 38
		printArray(arrayNums);
		arrayNums = sortThis(arrayNums);
		printArray(arrayNums);
	}

	public static void main(String[] args) {
			bubbleSort b1 = new bubbleSort();

	}
	
	public void printArray(int[] array)
	{
		System.out.println("Current array state:");
		for(int x = 0; x< array.length; x++)
		{
			System.out.print(array[x] + ", ");
		}
		System.out.print("\n");
	}
	
	public int[] sortThis(int[] array)
	{
		int swapped = 0;
        int n = array.length;
        int temp = 0;
        int x = 0;
        boolean ordered = false; 
        
        while (x<n && !ordered) {
        	
        	for(int y = 0; y<(n-x)-1;y++)
        	{
        		ordered = true;
        		if(array[y]>array[y+1])
        		{
        			// SWAP
        			temp = array[y];
        			array[y]=array[y+1];
        			array[y+1]=temp;
        			swapped++;
        			ordered = false;
        		}
        	}
        	
        	if (swapped == 0) {
        		break; 
        	}
        }
		return array;
		
	}

}



