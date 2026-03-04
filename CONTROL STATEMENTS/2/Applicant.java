public class Applicant{
	
	String name;
	int age;
	String licenseType;
	
	public Applicant(String name,int age,String licenseType){
		this.name=name;
		this.age=age;
		this.licenseType=licenseType;
	}
	
	public void eligibilityStatus(){
		System.out.println("------Final Result------");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("License Type: " + licenseType);
		
		if(licenseType.equalsIgnoreCase("Car")){
			if (age>=18)
				System.out.println("Eligible for car license");
			else
				System.out.println("Not eligible for car license");
		}
		else if(licenseType.equalsIgnoreCase("Commercial")){
			if (age>=20)
				System.out.println("Eligible for commercial license");
			else
				System.out.println("Not eligible for commercial license");
		}
		else if(licenseType.equalsIgnoreCase("Motorcycle Learner")){
			if (age>=16)
				System.out.println("Eligible for motorcycle learner license");
			else
				System.out.println("Not eligible for motorcycle learner license");
		}
		else{
			System.out.println("Invalid License Category");
		}
		System.out.println("-------------------------\n");
	}
}