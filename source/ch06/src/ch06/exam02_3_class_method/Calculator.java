package ch06.exam02_3_class_method;

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
