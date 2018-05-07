// Create by : Peter zhu
// Create on : May
// This is Vehicle class

public class Vehicle {
	
	private int _platenumber;
	private String _vehicleColor;
	private int _door;
	private int _speed;
	private int _maxSpeed;
	
	public Vehicle(int LicensePlateNumber ,int numberOfDoor, int Speed, int max, String color ) {
		_platenumber = LicensePlateNumber;
		_door = numberOfDoor;
		_speed = Speed;
		_maxSpeed = max;
		_vehicleColor = color;
	}
	
	
	public void speak() {
		System.out.println("The plate number is " + _platenumber);
		System.out.println("The color is " + _vehicleColor);
		System.out.println("The number of door is " + _door);
		System.out.println("The speed is " + _speed);
		System.out.println("The max speed is " + _maxSpeed);
		
	}
	
	protected void accelerate(int increament) {
		int _finalSpeed = increament + _speed;
		if (_finalSpeed > _maxSpeed) {
			_finalSpeed = _maxSpeed;
			System.out.println("You already reach the max speed");
		}
	}
	
	protected void brake(int decreasement) {
		int _slow = decreasement - _speed;
		if(_slow < 0 ) {
			_slow = 0;
			System.out.println("The car stop ");
		}
		
	}
	
}
