public class DomesticShipment extends Shipment{
	
	public DomesticShipment(int shipmentId,int weight,String destination){
		super(shipmentId,weight,destination);
	}
	
	@Override
	public double shippingCost(){
		return weight*50;
	}
}