public class SmartGadgets{
	public static void main(String[] args){
		
		Device initial=new Device();
		Device qualityTesting=new Device("MOBILE","V2.0");
		Device purchase=new Device("LAPTOP","V3.0",true);
		
		initial.displayDevice();
		qualityTesting.displayDevice();
		purchase.displayDevice();
		
	}
}

/*
-----------------------------------------
                Device
-----------------------------------------
- deviceName : String
- status : String
- firmwareVersion : String
-----------------------------------------
+ Device()
+ Device(deviceName:String, firmwareVersion:String)
+ Device(deviceName:String, firmwareVersion:String, purchased:boolean)
+ displayDevice() : void
-----------------------------------------
*/