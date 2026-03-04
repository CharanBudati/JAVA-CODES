public class Sculpture extends Artifact{
	
	public String material;
	
	public Sculpture(String name,int ID,String originCountry,String material){
		super( name,ID, originCountry);
		this.material=material;
	}
	
	@Override
	public void details(){
		System.out.println("---Sculpture Details---");
        System.out.println("ID: " + getID());
        System.out.println("Name: " + getname());
        System.out.println("Origin: " + getoriginCountry());
        System.out.println("Material: " + material);
        System.out.println("Entry Fee: ₹" + fee);
        System.out.println("---------------------------");
	}
}