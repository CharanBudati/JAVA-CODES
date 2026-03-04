public class Reservation{
	private String guestName;
	private String roomType;
	private int floorNumber;
	private int nightlyRate;
	
	public Reservation(){
		this.guestName="CHERRY";
		this.roomType="Standard";
		this.floorNumber=0;
		this.nightlyRate=2519;
	}
	
	public Reservation(String guestName,String roomType,int floorNumber,int nightlyRate){
		this.guestName=guestName;
		this.roomType=roomType;
		this.floorNumber=floorNumber;
		this.nightlyRate=nightlyRate;
	}
	
	public Reservation(Reservation refGuest,String newguestName){
		this.guestName=newguestName;
		this.roomType=refGuest.roomType;
		this.floorNumber=refGuest.floorNumber;
		this.nightlyRate=refGuest.nightlyRate;		
	}
	
	public void displayReservation(){
		System.out.println("-----------------------------------------------------------");
		System.out.println("Guest Name: " + guestName);
		System.out.println("Room Type: " + roomType);
		System.out.println("Floor Number: " + floorNumber);
		System.out.println("Nightly Rate: " + nightlyRate);
		System.out.println("-----------------------------------------------------------");
	}
}
		