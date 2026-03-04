public class Enrollment{
	
	static int roll=101;
	private String studentName;
	private int rollNumber;
	private String course;
	
	public Enrollment(){
		this.studentName="Unassigned";
		this.rollNumber=0;
		this.course="General";
	}
	
	public Enrollment( String studentName,String course){
		this.studentName=studentName;
		this.rollNumber=roll++;
		this.course=course;
	}
	
	public Enrollment(Enrollment e){
		this.studentName=e.studentName;
		this.rollNumber=roll++;
		this.course=e.course;
	}
	
	public void displayEnrollment(){
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Student Name: " + studentName);
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Course: " + course);
		System.out.println("-------------------------------------------------------------------------------");
	}
}