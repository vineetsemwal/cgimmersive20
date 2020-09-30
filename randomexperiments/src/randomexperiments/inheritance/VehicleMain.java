package randomexperiments.inheritance;

public class VehicleMain {

	public static void main(String args[]) {
		Vehicle car=new Car();
		car.moves();//run time polymorphism
		
		Vehicle bike=new Bike();
		bike.moves();
	
		
		Vehicle vehicles[]=new Vehicle[2];
		vehicles[0]=car;
		vehicles[1]=bike;
		System.out.println("moving all vehicles in array");
		for(int i=0;i <vehicles.length; i++) {
			Vehicle vehicle=vehicles[i];
			vehicle.moves();
		}
		
		 		
		
	}
}
