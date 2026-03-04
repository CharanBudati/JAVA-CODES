public class BankAccount{
	private int accNo;
	private int bal;
	
	protected String name;
	
	public static final double BWI=7.5;
	
	public BankAccount(int accNo,String name,int bal){
		this.accNo=accNo;
		this.name=name;
		this.bal=bal;
	}
	
	public int getaccNo(){
		return accNo;
	}
	
	public int getbal(){
		return bal;
	}
	
	public void deposit(int amount){
		bal+=amount;
	}
	
	public void withDrawal(int amount){
		bal-=amount;
	}
	
	public double calInt(){
		return (BWI/100)*bal;
	}
	
	public void display() {
        System.out.println("Account No: " + accNo);
        System.out.println("Holder Name: " + name);
        System.out.println("Balance: " + bal);
        System.out.println("Interest Rate: " + BWI + "%");
    }
}