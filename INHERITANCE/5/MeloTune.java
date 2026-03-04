public class MeloTune {
    public static void main(String[] args) {

        Content song = new Songs("Shape of You", 4.2, "Ed Sheeran", "Pop");
        Content podcast = new Podcasts("Tech Talks", 45, "Nova Media", 12);
        Content audiobook = new AudioBook("Atomic Habits", 320, "James Clear", 20);

       Content[] playlist={song,podcast,audiobook};

        System.out.println("---- MeloTune Content Demo ----");

        for(Content c : playlist){
			c.play();
			c.display();
            System.out.println("----------------------------");
        }
    }
}

/*
Content
---------------------------------
- title : String
- duration : double
- artist : String
---------------------------------
+ play()
+ display()
---------------------------------
        ▲
   ┌────┼───────┐
   │    │       │
 Song  Podcast  Audiobook
---------------------------------
- genre : String
- episodeNumber : int
- chapterCount : int
---------------------------------
+ display()   (overridden)
*/