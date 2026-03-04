public class CloudNine{
	public static void main(String[] args){
		
		Sensor s1 = new Sensor(1, "Rooftop", "key123", 28.5);
        Sensor s2 = new Sensor(2, "Lobby", "key234", 25.0);
        Sensor s3 = new Sensor(3, "Server Room", "key345", 22.8);
		
		s1.details();
		System.out.println("Fahrenheit: " + Sensor.helper(s1.reading));
		s2.details();
		System.out.println("Fahrenheit: " + Sensor.helper(s2.reading));
		s3.details();
		System.out.println("Fahrenheit: " + Sensor.helper(s3.reading));
		System.out.println("Active Sensors: " + Sensor.count);
	}
}
