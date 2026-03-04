public class Painting extends Artifact{
	
	public String medium;
	
	public Painting( String name,int ID,String originCountry,String medium){
		super( name,ID, originCountry);
		this.medium=medium;
	}
	
	@Override
	public void details(){
		System.out.println("---Painting Details---");
        System.out.println("ID: " + getID());
        System.out.println("Name: " + getname());
        System.out.println("Origin: " + getoriginCountry());
        System.out.println("Medium: " + medium);
        System.out.println("Entry Fee: ₹" + fee);
        System.out.println("---------------------------");
	}
}