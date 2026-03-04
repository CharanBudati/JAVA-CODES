public class AudioBook extends Content{
	
	int chapterCount;
	
	public AudioBook(String title,double duration,String artistName,int chapterCount){
	  super(title,duration,artistName);
	  this.chapterCount=chapterCount;
	}
	
	@Override
	public void display(){
		super.display();
		System.out.println("Chapters: " + chapterCount);
	}
}