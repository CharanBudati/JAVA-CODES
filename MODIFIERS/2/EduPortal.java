public class EduPortal{
	public static void main(String[] args){
		
		Stu s1=new Stu("A","123",1,85);
		Stu s2=new Stu("B","456",2,90);
		
		s1.stuDetails();
        s2.stuDetails();
		System.out.println("Total Students: " + Stu.count);
	}
}