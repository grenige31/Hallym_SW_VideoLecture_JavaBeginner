package ch06.exam05_static_member;

public class StaticCarExample {
	public static void main(String[] args) {
		int speed=60, curSpeed=0, totalSpeed=0;
		Car so = new Car();
		so.setSpeed(speed);
		Car avan = new Car();
		speed=100;
		avan.setSpeed(speed);
		
		curSpeed=so.getSpeed();
		System.out.println("so speed :"+curSpeed);
		curSpeed=avan.getSpeed();
		System.out.println("avan speed :"+curSpeed);
		totalSpeed=Car.getTotalSpeed();
		System.out.println("total speed :"+totalSpeed);

	};
}
