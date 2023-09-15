package inheritance;

public class VehicleUse {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.maxSpeed = 100;
		v.Color = "Blue";
		v.print();
		
		BiCycle b = new BiCycle();
		b.Name = "Hero";
		b.Color = "Green";
		b.maxSpeed = 40;
		b.print();
		
		Car c = new Car();
		c.Color = "Red";
		c.maxSpeed = 80;
		c.numDoors = 4;
		c.print();
	}

}
