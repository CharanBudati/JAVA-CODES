public class LogiFleet{
	public static void main(String[] args){
		
		DomesticShipment d1=new DomesticShipment(101,250,"Chennai");
		IntNatShipment i1=new IntNatShipment(202,2570,"USA");
		
		d1.details();
		System.out.println("Domestic Shipping Cost: " + d1.shippingCost());
		System.out.println("Tracking Number: " + Shipment.generateTrackingNumber(d1.shipmentId));
		i1.details();
		System.out.println("InterNational Shipping Cost: " + i1.shippingCost());
		System.out.println("Tracking Number: " + Shipment.generateTrackingNumber(i1.shipmentId));
	}
}

/*
                <<abstract>>
                ---------------------
                |     Shipment      |
                ---------------------
                | # shipmentId : int |
                | # weight : double  |
                | # destination : String |
                | # COMPANY_CODE : String {static, final} |
                ---------------------
                | + Shipment(int,double,String) |
                | + calculateShippingCost() : double {abstract} |
                | + generateTrackingNumber(int) : String {static} |
                | + displayDetails() : void |
                ---------------------
                         ▲
           ------------------------------
           |                            |
 ---------------------        --------------------------
 |  DomesticShipment |        | InternationalShipment |
 ---------------------        --------------------------
 | + calculateShippingCost() | + calculateShippingCost() |
 ---------------------        --------------------------
 */