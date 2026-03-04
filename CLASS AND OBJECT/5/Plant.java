public class Plant{
	
    int plantID;
	String plantName;
	String plantType;
	double price;
	int stockQuantity;
	
	public Plant(int plantID,String plantName,String plantType,double price,int stockQuantity){
		this.plantID=plantID;
		this.plantName=plantName;
		this.plantType=plantType;
		this.price=price;
		this.stockQuantity=stockQuantity;
	}
	
	void sell(int quantity){
		System.out.println("Attempting to sell " + quantity + " units of " + plantName);
		if (stockQuantity>=quantity){
			stockQuantity-=quantity;
			System.out.println("Sale successful!");
        } 
		else {
            System.out.println("Sale cannot be processed. Not enough stock.");
        }
		displayDetails();
	}
	
	void restock(int quantity){
		System.out.println("Restocking " + quantity + " units of " + plantName);
        stockQuantity += quantity;
        System.out.println("Restock successful!");
		displayDetails();
	}
	
	public void displayDetails(){
		System.out.println("-------Plant Details-------");
		System.out.println("Plant ID: " + plantID);
		System.out.println("Plant Name: "+ plantName);
		System.out.println("Plant Type: " + plantType);
		System.out.println("Price: " + price);
		System.out.println("Stock Quantity: " + stockQuantity);
		System.out.println("----------------------------");
	}
}
		