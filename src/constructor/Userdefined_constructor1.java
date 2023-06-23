package constructor;

public class Userdefined_constructor1 
{            
	 // step1: variable declaration
	
	int num1;         //non static globle variable
	int num2;        
	
    // step2:Globle variable initialization
	
	Userdefined_constructor1()             // User defined constructor
	{
		num1= 10;     
		num2= 20;     
	}
	
	//step3: variable usage
	public void addition() 
	{
		System.out.println(num1+num2);
	}
	
	public void substraction() 
	{
		System.out.println(num1-num2);
	}
	
	public void multiplication() 
	{
		System.out.println(num1*num2);
	}
	
	public void div() 
	{
		System.out.println(num1/num2);
	}
	
	
	public static void main(String[] args)
	{
		Userdefined_constructor1 s1=new Userdefined_constructor1();
		s1.addition();
		s1.substraction();
		s1.multiplication();
		s1.div();
		System.out.println("----------------------");
		
		Userdefined_constructor2 s2
		
		=new Userdefined_constructor2();

		s2.m1();
		s2.m2();
		s2.m3();
		s2.m4();
		s2.m5();
	}
	
	
	
	
	
	
	
	
	
}
