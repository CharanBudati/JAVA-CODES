public class EduTrack{
	public static void main(String[] args){
		
		Enrollment e1=new Enrollment();
		
		Enrollment e2=new Enrollment("CHAVYA","N725");
		
		Enrollment e3=new Enrollment(e2);
		
		e1.displayEnrollment();
		e2.displayEnrollment();
		e3.displayEnrollment();
	}
}