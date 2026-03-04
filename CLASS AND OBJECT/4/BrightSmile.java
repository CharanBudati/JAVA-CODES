public class BrightSmile{
	public static void main(String[] args){
		
		Patients p1=new Patients(1,"A","1234567891","Cleaning");
		Patients p2=new Patients(2,"B","123","Filling");
		Patients p3=new Patients(3,"C","456","Extraction");
		Patients p4=new Patients(4,"D","789","Root Canal");
		Patients p5=new Patients(5,"E","111","A");
		
		p1.displayDetails();
		p2.displayDetails();
		p3.displayDetails();
		p4.displayDetails();
		p5.displayDetails();
	}
}

/*
Patient
------------------------------------
- patientId : int
- name : String
- contactNumber : String
- procedure : String
------------------------------------
+ calculateCost() : double
+ displayDetails() : void
*/