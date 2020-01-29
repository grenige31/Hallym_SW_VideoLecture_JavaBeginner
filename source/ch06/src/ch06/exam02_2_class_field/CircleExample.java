package ch06.exam02_2_class_field;

class Calculator {
	int radius; 								
	String name;
	int getSum(int x, int y)
	{
		int sum = x+y;
		printSum(sum);
		return sum;
	}
	void  printSum(int s)
	{
		System.out.println(s);
	}

}

