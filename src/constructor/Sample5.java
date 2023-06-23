package constructor;

public class Sample5 
{
 int num1;
 int num2;
	
 Sample5(int a, int b)
 {
	 num1= a;
	 num2= b;
 }
	public void m2() 
	{
	  System.out.println(num1+num2);
	  System.out.println(num1*num2);
	}
	
	public void m3() 
	{
	 System.out.println(num1==num2);	
	 System.out.println(num1<=num2);
	}
	
}
