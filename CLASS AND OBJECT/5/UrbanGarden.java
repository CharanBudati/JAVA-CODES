public class UrbanGarden{
	public static void main(String[] args){
		
		Plant p1 = new Plant(1,"A","Indoor",257,9);
		Plant p2 = new Plant(2,"B","Outdoor",475,7);
		Plant p3 = new Plant(3,"C","Indoor",500,5);
		
		System.out.println("Initial Inventory:");
		p1.displayDetails();
		p2.displayDetails();
		p3.displayDetails();
		
		p1.sell(3);
        p2.sell(10);
        p2.restock(20);
		
	}
}
		
		