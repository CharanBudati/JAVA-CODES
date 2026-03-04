public class RoyalStay{
	public static void main(String[] args){
		
		Reservation walkIn = new Reservation();
		walkIn.displayReservation();
		Reservation advance = new Reservation("CHAVYA","Deluxe",25,2507);
		advance.displayReservation();
		Reservation reffered = new Reservation(advance,"NAVYA");
		reffered.displayReservation();
		
	}
}


/*
+-----------------------+
|      Reservation      |
+-----------------------+
| - guestName : String  |
| - roomType : String   |
| - floorNumber : int   |
| - nightlyRate : double|
+-----------------------+
| + Reservation()       |
| + Reservation(String, |
|   String, int, double)|
| + Reservation(        |
|   Reservation, String)|
| + displayReservation()|
+-----------------------+
*/