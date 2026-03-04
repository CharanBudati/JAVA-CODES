public class Students extends Persons{
	String department;
	double cgpa;
	
	public Students(String name,int id,String department,double cgpa){
		super(name,id);
		this.department=department;
		this.cgpa=cgpa;
	}
	
	public void displayStudentsDetails(){
		System.out.println("Department: " + department);
		System.out.println("CGPA: " + cgpa);
	}
}