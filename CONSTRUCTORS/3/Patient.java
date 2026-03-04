public class Patient{
	
	static int IDcounter=1001;
	
	private int patientID;
	private String name;
	private int age;
	private String ward;
	private String healthNotes;
	
	public Patient(){
		this.patientID= IDcounter++;
		this.name="UNKNOWN";
		this.age=0;
		this.ward="EMERGENCY";
		this.healthNotes="NONE";
	}
	
	public Patient(String name,int age,String ward){
		this.patientID= IDcounter++;
		this.name=name;
		this.age=age;
		this.ward=ward;
		this.healthNotes="NONE";
	}
	
	public Patient(String name,int age,String healthNotes,boolean isCamp){
		this.patientID= IDcounter++;
		this.name=name;
		this.age=age;
		this.ward="CAMP";
		this.healthNotes=healthNotes;
	}
	
	public Patient(Patient p){
		this.patientID= IDcounter++;
		this.name=p.name;
		this.age=p.age;
		this.ward="ADMITTED";
		this.healthNotes=p.healthNotes;
	}
	
	public void displayPatient(){
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Patient ID: " + patientID);
		System.out.println("Patient Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Ward: " + ward);
		System.out.println("Health Notes: " + healthNotes);
		System.out.println("-------------------------------------------------------------------------------");
	}
}