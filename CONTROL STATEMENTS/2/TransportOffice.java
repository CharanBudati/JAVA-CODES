public class TransportOffice{
	public static void main(String[] args){
		
		Applicant a1 = new Applicant("A",18,"Car");
		Applicant a2 = new Applicant("B",17,"Car");
		Applicant a3 = new Applicant("C",25,"Commercial");
		Applicant a4 = new Applicant("D",15,"Mototcycle Learner");
		Applicant a5 = new Applicant("E",17,"C");
		
		Applicant[] applicants={a1,a2,a3,a4,a5};
		
		for(Applicant a : applicants)
			a.eligibilityStatus();
		
	}
}