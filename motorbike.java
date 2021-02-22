
public class motorbike extends vehicle{
	
	public motorbike(String r, String ma, String mo, String c, String o, double v,int w, boolean t ) {
		super (r,ma,mo,c,o,v,2,t);
	}

	
	public double crash() {
		value=value*0.25;
		return value; 
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
