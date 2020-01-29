package ch06.exam02_2_class_field;

public class Circle {
	int radius; 							// 원의 반지름을 저장하는 멤버 변수
	String name; 						// 원의 이름을 저장하는 멤버 변수

	public double getArea() { 	// 멤버 메소드
		return 3.14*radius*radius;
	}
}
