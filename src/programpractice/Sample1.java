package programpractice;

public class Sample1
{                           ////////WITHOUT PARAMETERS////////
	
               //static regular method call from same class
	
	public static void main(String[] args) 
	{
		System.out.println("main method statement");
	    System.out.println("to call SRM from same class");
	    
	           //method call
	    Sample1.m1();
	    Sample1.m1();
	}
	
	            //static regular method
	public static void m1() 
	{
		System.out.println("running static regular method from same class");
	    System.out.println("syntax for call SRM from same class is- classname.methodname();");
	}
	
	
}
