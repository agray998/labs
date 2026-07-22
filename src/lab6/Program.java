package lab6;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle(0, 1);
//		v1.accelerate(30);
//		System.out.println(v1.getDetails());
//		v1.accelerate(50);
//		System.out.println(v1.getDetails());
//		v1.brake(10);
//		System.out.println(v1.getDetails());
		Vehicle v2 = new Vehicle(0, 2);
		Vehicle v3 = new Vehicle(0, 3);
		System.out.println(Vehicle.getVehicleCount());
		Vehicle[] vehicles = {v1, v2, v3};
		for (Vehicle v : vehicles) {
			System.out.println(v.getDetails());
		}
		boolean raceOngoing = true;
		Vehicle winner = new Vehicle(0, 1);
		do {
			Random rand = new Random();
			for (Vehicle v : vehicles) {
				v.accelerate(rand.nextInt(10) + 1);
			}
			for (Vehicle v : vehicles) {
				if (v.getDistance() >= 1000) {
					winner = v;
					raceOngoing = false;
				}
			}
		} while (raceOngoing); // until a vehicle hits d=1000
		System.out.println("Race finished. Winner is:");
		System.out.println(winner.getDetails());
	}

}
