package lab6;

public class Vehicle {
	private int speed, lane, distance;
	RegistrationPlate regPlate;
	
	public Vehicle(int speed, int lane) {
		this.speed = speed;
		this.lane = lane;
		this.regPlate = RegistrationPlateFactory.getNextRegistrationPlate();
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public int getDistance() {
		return this.distance;
	}
	
	public int getLane() {
		return this.lane;
	}
	
	public void setDistance(int d) {
		this.distance = d;
	}
	
	public void setLane(int l) {
		this.lane = l;
	}
	
	public void accelerate(int amount) {
		if (this.speed + amount > 200) {
			this.speed = 200;
			System.out.println("Max speed reached");
		} else {
			this.speed += amount;
		}
		this.distance += this.speed;
	}
	
	public void brake(int amount) {
		this.speed -= amount;
		this.distance += this.speed;
	}
	
	public String getDetails() {
		return String.format("Speed: %d\nLane: %d\nDistance Travelled: %d\nPlate: %s", this.speed, this.lane, this.distance, this.regPlate.getNumber());
	}

}
