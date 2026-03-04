public class Device{
	
	private String deviceName;
	private String status;
	private String firmfareVersion;
	
	public Device(){
		this.deviceName="SG-Device";
		this.status="Inactive";
		this.firmfareVersion="v1.0";
	}
	
	public Device(String deviceName,String firmfareVersion){
		this.deviceName=deviceName;
		this.status="Inactive";
		this.firmfareVersion=firmfareVersion;
	}
	
	public Device(String deviceName,String firmfareVersion,boolean Purchased){
		this.deviceName=deviceName;
		this.status="Active";
		this.firmfareVersion=firmfareVersion;
	}
	
	public void displayDevice(){
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Device Name: " + deviceName);
		System.out.println("Status: " + status);
		System.out.println("Version: " + firmfareVersion);
		System.out.println("-------------------------------------------------------------------------------");
	}
}