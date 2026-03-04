public class Stu{
	private String aadharNo; 
	
	protected double intMarks;
	
	public String name;
	public int rollNo;
	
	public static final String motto="Knowledge Is Power";
	
	public static int count=0;
	
	public Stu(String name,String aadharNo,int rollNo,double intMarks){
		this.name=name;
		this.aadharNo=aadharNo;
		this.rollNo=rollNo;
		this.intMarks=intMarks;
		count++;
	}
	
	public void stuDetails(){
		System.out.println("-----Student Details-----");
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNo);
        System.out.println("Internal Marks: " + intMarks);
		System.out.println("----------------------------");
    }
}
