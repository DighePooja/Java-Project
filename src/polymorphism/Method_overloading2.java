package polymorphism;

public class Method_overloading2 
{

	public void relational(int num1,short num2) 
	{
	  	System.out.println(num1==num2);
	  	System.out.println(num1<=num2);
	  	System.out.println(num1>=num2);
	  	System.out.println(num1!=num2);
	}
	
	public void relational(int num1, int num2) 
	{
		System.out.println("-----------");
		System.out.println(num1==num2);
	  	System.out.println(num1<=num2);
	  	System.out.println(num1>=num2);
	  	System.out.println(num1!=num2);
	}
	
	public static void main(String[] args) 
	{
		Method_overloading2 s2=new Method_overloading2 ();
		s2.relational(5,6);
		s2.relational(15,10);
	}
	
	
	
	
	
}
