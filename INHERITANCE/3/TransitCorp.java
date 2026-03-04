public class TransitCorp{
	public static void main(String[] args){
		
		Vehicle v1=new Buses(123,"PETROL",100,200);
		Vehicle v2=new Trucks(456,"PETROL",120,500);
		Vehicle v3=new Van(789,"PETROL",140,true);
		
		Vehicle[] fleet={v1,v2,v3};
		
		System.out.println("---- TransitCorp Fleet Details ----");
		
		for(Vehicle v:fleet){
			v.start();
			v.displayDetails();
			v.stop();
			System.out.println("-----------------------------");
		}
	}
}

/*
                Vehicle
-----------------------------------
- registrationNumber : String
- fuelType : String
- maxSpeed : int
-----------------------------------
+ start()
+ stop()
+ describe()
-----------------------------------
        ▲
        │
 ┌──────┼────────┐
 │      │        │
Bus    Truck     Van
-----  --------  ----------------
- passengerCapacity : int
- cargoLimit : double
- refrigeration : boolean
-----------------------------------
+ describe()  (overridden in all)
*/