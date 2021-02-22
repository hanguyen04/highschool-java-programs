
public class employee {
	private String name; 
    private String address; 
    private int accNo; 
    private int dob; 
    private int paycheck; 
   
    public employee(String n, String a, int aN, int dob, int pay)
    {
       this.name = n;
       this.address = a; 
       this.accNo = aN; 
       this.dob = dob; 
       this.paycheck = pay; 
    }

    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public int getAccNo(){
        return accNo;
    }
    
    public int getDob(){
        return dob;
    }
    
    public int getPaycheck(){
        return paycheck;
    }
    
    public void setPaycheck (int p)
    {
        this.paycheck = p;  
    }
    
    private void changeAddress(String a){
        this.address = a; 
    }
    
    private void changeAccNo(int aN){
        this.accNo = aN; 
    }
    
    private void changeName(String n){
        this.name = n;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
