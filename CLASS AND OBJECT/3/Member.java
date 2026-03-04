public class Member{
	
	String ID;
	String name;
	int age;
	String membershipType;
	
	public Member(String ID,String name,int age,String membershipType){
		this.ID=ID;
		this.name=name;
		this.age=age;
		this.membershipType=membershipType;
	}
	boolean youthDiscount(){
		return (age<25);
	}
	
	public void displayDetails(){
		System.out.println("---Member Details---");
		System.out.println("Member ID: " + ID);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Membership Type: " + membershipType);
		
		if (youthDiscount()){
			System.out.println(name + " gets youth discount" );
		}
		else{
			System.out.println(name + " did not get youth discount" );
		}
		
		System.out.println("-----------------------------");
	}
}
		