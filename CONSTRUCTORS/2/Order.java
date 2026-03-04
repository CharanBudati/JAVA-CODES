public class Order{
	private String itemName;
	private int quantity;
	private String deliveryAddress;
	public String specialInstructions;
	
	public Order(){
		this.itemName="Veg Combo";
		this.quantity=1;
		this.deliveryAddress="To be updated";
		this.specialInstructions="None";
	}
	
	public Order(String itemName,int quantity){
		this.itemName=itemName;
		this.quantity=quantity;
		this.deliveryAddress="Home Address on File";
		this.specialInstructions="None";
	}
	
	public Order(String itemName,int quantity,String deliveryAddress,String specialInstructions){
		this.itemName=itemName;
		this.quantity=quantity;
		this.deliveryAddress=deliveryAddress;
		this.specialInstructions=specialInstructions;
	}
	
	public void displayOrder(){
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Item: " + itemName);
		System.out.println("Quantity: " + quantity);
		System.out.println("Delivery Address: " + deliveryAddress);
		System.out.println("Special Instructions: " + specialInstructions);
		System.out.println("-------------------------------------------------------------------------------");
	}
}