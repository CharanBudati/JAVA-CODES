public class SparkleWash{
	public static void main(String[] args){
		
		Cars c1=new Cars("AP 25 BV 19","CHAVYA","Mustang","Black");
		Cars c2=new Cars("AP 25 NC 07","CHERRY","Supra","Red");
		Cars c3=new Cars("AP 25 SS 09","NIMMI","Hurrican","Yellow");
		
		c1.basicWash();
		c2.interiorCleaning();
		c3.fulService();
	}
}
/*
Car
-----------------------------------
- licensePlate : String
- ownerName : String
- model : String
- color : String
-----------------------------------
+ basicWash()
+ interiorCleaning()
+ fullDetailService()
+ displayDetails(serviceType : String)
*/