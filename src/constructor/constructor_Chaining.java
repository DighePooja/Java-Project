package constructor;

public class constructor_Chaining {
     
	int num1;
	int num2;
	int num3;
	
	constructor_Chaining()
	{
		num1=10;
		num2=20;
		System.out.println(num1+num2);
	}
	constructor_Chaining(int a, int b)
	{
		this();
		num1=a;
		num2=b;
		System.out.println(num1*num2);
	}
	constructor_Chaining(int a, int b, int c)
	{
		this(10,20);
		num1=a;
		num2=b;
		num3=c;
		System.out.println(num1+num2+num3);
	}
	public static void main(String[] args) 
	{
		constructor_Chaining c=new constructor_Chaining(10,15,25);
	}
}
