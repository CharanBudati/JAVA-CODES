public class Content{
	
	String title;
	double duration;
	String artistName;
	
	public Content(String title,double duration,String artistName){
		this.title=title;
		this.duration=duration;
		this.artistName=artistName;
	}
	
	public void play(){
		System.out.println("Now Playing: " + title);
	}
		
	public void display(){
		System.out.println("Title: " + title);
		System.out.println("Duration: " + duration);
		System.out.println("Artist Name: " + artistName);
	}
}