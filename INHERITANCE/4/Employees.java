public class Employees{
	
	String name;
	int ID;
	int salary;
	
	public Employees(String name,int ID,int salary){
		this.name=name;
		this.ID=ID;
		this.salary=salary;
	}
	
	public void profile(){
		System.out.println("Employee Name: " + name);
		System.out.println("Employee ID: " + ID);
		System.out.println("Salary: " + salary);
	}
}