import java.util.ArrayList;

public class garage {
	
	ArrayList<motorbike> bikes = new ArrayList<motorbike>();
	ArrayList<car> cars = new ArrayList<car>();

	public void viewBikes()
    {
    	for (int i = 0; i < bikes.size();i++)
	      { 		      
	    	 System.out.println("Bike: "+i);
	    	 System.out.println((bikes.get(i)).getMake());
	    	 System.out.println((bikes.get(i)).getModel());
	    	 System.out.println((bikes.get(i)).getOwner());
	    	 System.out.println((bikes.get(i)).getValue());
	    	 
	      }
    }
	
	public void viewCars()
    {
    	for (int i = 0; i < cars.size();i++)
	      { 		      
    		System.out.println((cars.get(i)).getMake());
	    	 System.out.println((cars.get(i)).getModel());
	    	 System.out.println((cars.get(i)).getOwner());
	    	 System.out.println((cars.get(i)).getValue());
	    	 
	      }
    }
	
	public void addCar(String r, String ma, String mo, String c, String o, double v,int w, boolean t, int d, int s, boolean sun)
    {
    	car newCar = new car (r,ma,mo,c,o,v,4,t,d,s,sun);
    	cars.add(newCar);
    }
	
	public void addBike(String r, String ma, String mo, String c, String o, double v,int w, boolean t )
    {
    	motorbike newBike = new motorbike (r,ma,mo,c,o,v,2,t);
    	bikes.add(newBike);
    }
	
	public garage()
	{
	}
	
	public static void main(String[] args) {
		garage garage1 = new garage();
		garage1.addCar("a","b","c","d","e",8.5,7,true,6,5,true);
		garage1.viewCars(); 
	}

}
