public class Shipment{
	
	protected int shipmentId;
	protected int weight;
	protected String destination;
	
	public static final String companyCode="LOGI";
	
	public Shipment(int shipmentId,int weight,String destination){
		this.shipmentId=shipmentId;
		this.weight=weight;
		this.destination=destination;
	}
	
	public double shippingCost(){
		return 0;
	}
	
	public static String generateTrackingNumber(int shipmentId) {
        return companyCode + shipmentId;
    }


	public void details(){
		System.out.println("---Shipment Details---");
		System.out.println("Shipment ID: " + shipmentId);
		System.out.println("Weight: " + weight + "kg");
		System.out.println("Destination: " + destination);
		System.out.println("--------------------------");
	}
}
		