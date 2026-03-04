import java.util.Scanner;

public class TasteBudCafe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---- TasteBud Café Menu ----");
        System.out.println("1. Beverages (₹100)");
        System.out.println("2. Starters (₹200)");
        System.out.println("3. Main Course (₹400)");
        System.out.println("4. Desserts (₹150)");
        System.out.println("5. Combo Meals (₹600)");
		
        System.out.print("Select category (1-5): ");
		int choice=scanner.nextInt();
		
		double price=0;
		String category="";
		
		switch(choice){
			case 1 : category="Beverages";
			               price = 100;
						   break;
			case 2 : category="Starters";
			               price = 200;
						   break;
            case 3 : category="Main Course";
			               price = 400;
						   break;
            case 4 : category="Desserts";
			               price = 150;
						   break;
            case 5 : category="Combo Meals";
			               price = 600;
						   break;						   
			default : System.out.println("Invalid Choice");
		
		}
		
		System.out.print("Enter quantity: ");
		int quantity=scanner.nextInt();
		
		double total=price*quantity;
		
		double discount=0;
		
		if(total>1000)
			discount=0.10*total;
		else if(total>2000)
			discount=0.20*total;
		
		double finalAmount=total-discount;
		
		System.out.println("----Final Bill---");
		System.out.println("Category: " + category);
        System.out.println("Unit Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: ₹" + total);
        System.out.println("Discount Applied: ₹" + discount);
        System.out.println("Final Payable Amount: ₹" + finalAmount);
        System.out.println("--------------------");
		
		scanner.close();
	}
}
		