import java.util.Scanner;

public class IronForge{
	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter worker's name: ");
		String name=scanner.nextLine();
		
		System.out.println("Enter worker's salary: ");
		double salary=scanner.nextDouble();
		
		System.out.println("Enter worker's experience(in years): ");
		int experience=scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter worker's department: ");
		String department=scanner.nextLine();
		
		double bonus=0;
		
		if(experience<2)
			 bonus=0;
		else if(experience >= 2 && experience <= 5)
			 bonus=salary*0.10;
		else if(experience > 5 && experience <= 10)
			 bonus=0.20*salary;
		else if(experience>=10)
			 bonus=0.35*salary;
	
		
		if(department.equalsIgnoreCase("Hazardous"))
			bonus+=5000;
		
		System.out.println("---Bonus Details---");
		System.out.println("Worker Name: " + name);
		System.out.println("Experience: " + experience);
		System.out.println("Department: " + department);
		System.out.println("Final Bonus: " + bonus);
		System.out.println("------------------");
	}
}