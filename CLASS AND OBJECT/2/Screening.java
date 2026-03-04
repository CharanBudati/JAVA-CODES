public class Screening{
	
	String movieName;
	String showTime;
	int screenNo;
	int availableSeats;
	
	public Screening(String movieName,String showTime,int screenNo,int availableSeats){
		this.movieName=movieName;
		this.showTime=showTime;
		this.screenNo=screenNo;
		this.availableSeats=availableSeats;
	}
	
	public void bookTickets(int seats){
		if (availableSeats>=seats){
			availableSeats-=seats;
			System.out.println(seats + " are booked for " + movieName);
		}
		else{
			System.out.println("Seats are unsufficient");
		}
	}
	
	public void cancelTickets(int seats){
		availableSeats+=seats;
		System.out.println(seats + " are cancelled for " + movieName);
	}
	
	public void displayDetails(){
		System.out.println("Movie Name: " + movieName);
		System.out.println("Show Time: " + showTime);
		System.out.println("Screen Number: " + screenNo);
		System.out.println("Available Seats: " + availableSeats);
		System.out.println("----------------------------------------");
	}
}
		