package interface_implementationClass;

//Implementation class  or sub class

public class Sample implements Multiple_1 , Multiple_2
{

   public void add()
   {
	   System.out.println(num1+num2);
   }
	
   public void mul()
   {
	   System.out.println(num1*num2);
   }
	
	public void sub()
	{
		System.out.println(num1-num2);
	}
	
	public void div()
	{
		System.out.println(num1/num2);
		
	}
	
	public void R1() 
	{
		System.out.println(no1>=no2);
	}
   
	public void R2() 
	{
		System.out.println(no1<=no2);
	}
	
	public void R3() 
	{
		System.out.println(no1==no2);
	}
	
	public void R4() 
	{
		System.out.println(no1!=no2);
	}
	
	
}
