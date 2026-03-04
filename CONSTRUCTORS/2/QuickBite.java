public class QuickBite{
	public static void main(String[] args){
		
		Order order1=new Order();
		
		Order order2=new Order("Pani-Puri",25);
		
		Order order3=new Order("Chocolates",7,"Chinna Bus Stand","Dark");
		
		order1.displayOrder();
		
		order2.displayOrder();
		
		order3.displayOrder();
		
	}
}