import java.util.Scanner;


public class AQI_OOP {
	private int aqi; 
	private String recommendation; 
	
	public void clasify (){
        if (aqi>300) {
            recommendation = "Stay indoor at all times";
        } else if (aqi>200){
            recommendation = "Limit activity outdoors";
        } else if (aqi>150){
            recommendation = "No more than 20 minutes of outdoor activity";
        } else if (aqi>=100){
            recommendation = "Be aware if you have a health conditions";
        } else {
            recommendation = "Periodically monitor the AQI";
        }
    }
	
	public void purify () {
		aqi = (int)aqi/2; 
		clasify();
	}
	
	public AQI_OOP (int enteredAQI){
		aqi = enteredAQI;
		
	}
	
	
	
	
	public static void main(String[] args) {
		AQI_OOP data1 = new AQI_OOP(50); //create a new object with the data type of the class
		data1.clasify(); //call the method for what we want to do with the object 
		
		AQI_OOP data2 = new AQI_OOP(260);
		System.out.println(data2.aqi);
		data2.purify();
		System.out.println(data2.aqi);
		System.out.println(data2.recommendation); 
		
	}
	
	

}
