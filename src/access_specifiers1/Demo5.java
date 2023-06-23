package access_specifiers1;

public class Demo5 
{

	protected int num1;
	protected	int num2;
	
	protected Demo5(int a , int b)
	{
		num1=a;
		num2=b;
	}
	
	protected void add() 
	{
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) 
	{
		Demo5 d1=new Demo5(5,6);
		d1.add();
	}
}
