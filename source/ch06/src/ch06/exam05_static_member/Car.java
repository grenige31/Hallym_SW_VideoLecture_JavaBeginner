package ch06.exam05_static_member;

public class Car {
      
	int speed;
	static int totalSpeed=0;
	
	static int getTotalSpeed()
	{
		return totalSpeed;
	}
	
	int getSpeed()
	{
		return speed;
	}
	void setSpeed(int sp)
	{
		totalSpeed+=sp;
		speed=sp;
	}
	
}

