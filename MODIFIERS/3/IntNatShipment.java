public class IntNatShipment extends Shipment{
	
	public IntNatShipment(int shipmentId,int weight,String destination){
		super(shipmentId,weight,destination);
	}
	
	@Override
	public double shippingCost(){
		return weight*200 + 1000;
	}
}