public class Songs extends Content{
	
	String genre;
	
	public Songs(String title,double duration,String artistName,String genre){
	 super(title,duration,artistName);
	 this.genre=genre;
	}
	
	@Override
	public void display(){
		super.display();
		System.out.println("Genre: " + genre);
	}
}
	