import java.util.ArrayList;
public class classroom {
	
	ArrayList<assignment> assignments = new ArrayList<assignment>();
	
    public void addAssignment(String title, int totalMark)
    {
    	assignment a = new assignment (title,totalMark);
    	assignments.add(a);
    }
    
    // This method should loop over the arraylist using the .size() method
    // printing the data in the format "title" : "mark".
    // It should also display the total marks available from all assignments.
    
    public void viewAssignments()
    {
    	for (int i = 0; i < assignments.size();i++)
	      { 		      
	    	 System.out.println("Assignment: "+i);
	    	 System.out.println((assignments.get(i)).getTitle());
	    	 System.out.println((assignments.get(i)).getTotal());
	    	 
	      }
    }
	
	public static void main(String[] args) {
		classroom compSci = new classroom();
		compSci.addAssignment("java",10);
		compSci.addAssignment("abstraction",25);
		
		classroom mafs = new classroom(); 
		mafs.addAssignment("2N", 20);
		
		
		System.out.println("CompSci homeworks:");
		compSci.viewAssignments(); 
		System.out.println("Maths homeworks:");
		mafs.viewAssignments(); 
		
	}

	public classroom()
	{
	}
	
}
