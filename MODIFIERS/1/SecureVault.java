public class SecureVault{
	public static void main(String[] args){
		
		SavingsAccount sa = new SavingsAccount(123,"Chavya",1000);
		CurrentAccount ca = new CurrentAccount(456,"Cherry",2000);
		
		sa.deposit(500);
		ca.withDrawal(100);
		
		sa.display();
        System.out.println("Savings Account Interest: " + sa.calInt());
        System.out.println("----------------------------");
        ca.display();
        System.out.println("Current Account Interest: " + ca.calInt());

	}
}