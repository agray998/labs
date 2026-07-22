package lab6;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle(0, 1);
		v1.accelerate(30);
		System.out.println(v1.getDetails());
		v1.accelerate(50);
		System.out.println(v1.getDetails());
		v1.brake(10);
		System.out.println(v1.getDetails());
		Vehicle v2 = new Vehicle(0, 2);
		Vehicle v3 = new Vehicle(0, 3);
		Vehicle[] vehicles = {v1, v2, v3};
		for (Vehicle v : vehicles) {
			System.out.println(v.getDetails());
		}
	}

}
