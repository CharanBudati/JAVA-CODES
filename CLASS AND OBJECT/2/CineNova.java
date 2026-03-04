public class CineNova{
	public static void main(String[] args){
		
		Screening s1=new Screening("Geetha Govindam","6:30",1,725);
		Screening s2=new Screening("Sirai","2:30",2,925);
		
		s1.bookTickets(919);
		s2.bookTickets(475);
		s1.bookTickets(25);
		
		s2.cancelTickets(50);
		
		System.out.println("---Final Transactions---");
		s1.displayDetails();
		s2.displayDetails();
		
	}
}