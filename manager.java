import java.util.ArrayList;
public class manager {
	
	public static void main(String[] args) {
		ArrayList<employee> listOfEmployees = new ArrayList<employee>();
		
		 employee e = new employee("bob", "abcd", 43, 221194, 5000);  
		 employee e2 = new employee("ma", "home", 007, 010120, 10);  
		 employee e3 = new employee("hollie", "urhart", 502, 010101, 530); 
	     System.out.println(e.getPaycheck());
	     System.out.println(e.getName());
	       
	     e.setPaycheck(10000); 
	     System.out.println(e.getPaycheck());
	     
	     listOfEmployees.add(e);
	     listOfEmployees.add(e2);
	     listOfEmployees.add(e3);
	     
	     for (int i = 0; i < listOfEmployees.size();i++)
	      { 		      
	    	 System.out.println("Employee: "+i);
	    	 System.out.println((listOfEmployees.get(i)).getName());
	    	 System.out.println((listOfEmployees.get(i)).getAddress());
	    	 System.out.println((listOfEmployees.get(i)).getAccNo());
	    	 System.out.println((listOfEmployees.get(i)).getDob());
	    	 System.out.println((listOfEmployees.get(i)).getPaycheck());
	    	 
	    	 
	      }
	     

	}

}
