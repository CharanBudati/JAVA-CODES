abstract class Artifact{
	
	private String name;
	private int ID;
	private String originCountry;
	
	private static int count=0;
	
	public static final int fee=500;
	
	public Artifact(String name,int ID,String originCountry){
		this.name=name;
		this.ID=ID;
		this.originCountry=originCountry;
		count++;
	}
	
	public String getname(){
		return name;
	}
	
	public int getID(){
		return ID;
	}
	
	public String getoriginCountry(){
		return originCountry;
	}
	
	public static int getcount(){
		return count;
	}
	
	abstract void details();
}