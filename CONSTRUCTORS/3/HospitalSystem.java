public class HospitalSystem{
	public static void main(String[] args){
		
		Patient patient1=new Patient();
		
		Patient patient2=new Patient("A",1,"OPD");
		
		Patient campPatient=new Patient("B",2,"SICK",true);
		
		Patient AdmittedPatient=new Patient(campPatient);
		
		patient1.displayPatient();
		patient2.displayPatient();
		campPatient.displayPatient();
		AdmittedPatient.displayPatient();
		
	}
}