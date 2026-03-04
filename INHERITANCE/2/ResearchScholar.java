public class ResearchScholar extends Students{
	String topic;
	String guideName;
	
	public ResearchScholar(String name,int id,String department,double cgpa,String topic,String guideName){
		super(name,id,department,cgpa);
		this.topic=topic;
		this.guideName=guideName;
	}
	
	public void displayResearchScholarDetails(){
		displayPersonsDetails();
		displayStudentsDetails();
		System.out.println("Research Topic: " + topic);
		System.out.println("Guide Name: " + guideName);
	}
}