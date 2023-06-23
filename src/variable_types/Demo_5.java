package variable_types;

public class Demo_5 
{
	int x=35;            //non static globle variable 

	public static void m7() 
	{
		Demo_5 obj4=new Demo_5();               //object creation
		System.out.println("---non static globle variable of SRM call from diff class");
		System.out.println(obj4.x);             //variable call
	}
	
	public void m8() 
	{
		System.out.println("---non static globle variable of NSRM call from diff class");
		System.out.println(x);                 //non static globle variable can direct access in non static regular method
	}
	
}
