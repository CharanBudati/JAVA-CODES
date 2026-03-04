public class Podcasts extends Content{
	
	int episodeNumber;
	
	public Podcasts(String title,double duration,String artistName,int episodeNumber){
	  super(title,duration,artistName);
	  this.episodeNumber=episodeNumber;
	}
	
	@Override
	public void display(){
		super.display();
		System.out.println("Episode Number: " + episodeNumber);
	}
}
	