
public class car extends vehicle {
	
	private int doors;
	private int seats; 
	private boolean sunroof;
	
	public car(String r, String ma, String mo, String c, String o, double v,int w, boolean t, int d, int s, boolean sun ) {
		super (r,ma,mo,c,o,v,4,t);
		this.doors = d;
		this.sunroof = sun;
		this.seats = s; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
