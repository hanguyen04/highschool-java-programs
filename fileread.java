import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class fileread {
	
	public static boolean intCheck(String c) { //check for string
		try {
			Integer.parseInt(c);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	static ArrayList<String> students = new ArrayList<String>();

	public static void main(String[] args) {
		
		 try {
		      File myObj = new File("/Users/huongnguyenthimai/Desktop/school stuff/IBy12/src/members.txt"); //locate file 
		      Scanner myReader = new Scanner(myObj); //read file
		      while (myReader.hasNextLine()) { //read line to line
		        String data = myReader.nextLine();
		        students.add(data);
		        System.out.println(data);		        
		      } 
		      myReader.close();
		    } catch (FileNotFoundException e) { //try catch error if there's no file
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 
		double [] distances = new double [students.size()]; 
		int n = 0;
		 
		for (int i=0;i<students.size();i++) {
			String person = students.get(i); //get each string of student
			int comma = person.indexOf(",", person.indexOf(",") + 1); //locate the second comma before numerical part
			
			String strDistance = person.substring(comma+1,person.length()); //get the numerical part at the end of array
			double distance = Double.parseDouble(strDistance); 
			distances[n] = distance; //add to array of numbers
			n++;
		}
		
		double largest = 0;
		for (int i = 0; i<distances.length;i++) {
			if (distances[i]>largest) {
				largest = distances[i]; //find longest distance ran 
			}
		}
		
		ArrayList<String> topRunners = new ArrayList<String>();
		double topPercentage = largest*0.7;
		for (int i = 0; i<distances.length;i++) {
			if (distances[i]>topPercentage) {
				topRunners.add(students.get(i)); //find top 70 percent
			}
		}
		
		try {
			   File file = new File("/Users/huongnguyenthimai/Desktop/school stuff/IBy12/src/topStudents.txt");
			   file.createNewFile(); //create new file in the same folder 
			} catch(Exception e) {
			   e.printStackTrace(); //catch error
			}
		
		try {
		      FileWriter myWriter = new FileWriter("/Users/huongnguyenthimai/Desktop/school stuff/IBy12/src/topStudents.txt");
		      for (int i=0;i<topRunners.size();i++) {
		    	  myWriter.write(topRunners.get(i)+"\n"); //write in the data from the code into file
		      }
		      myWriter.close(); //close writer 
		      System.out.println("Successfully wrote to the file."); //check if the process is finished 
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace(); //error check
		    }
		
	}

}


