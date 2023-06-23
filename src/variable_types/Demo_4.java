package variable_types;

public class Demo_4 
{                   //non static globle variable call
     int i=25;
     
	public static void main(String[] args) 
	{
		Demo_4 obj2=new Demo_4();                         // 1) object creation of class
		System.out.println("non static globle variable call from static main method");
		System.out.println(obj2.i);                       // 2) variable call-object name.veriable name		
		
		m5();                                      //static regular method call from same class-->methodname();
		
		
		obj2.m6();                                        //non static regular method call from same class-->object name.methodname();
		
		Demo_5.m7();                                      //static regular method call from diff class
		
		Demo_5 obj5=new Demo_5();                         //non static regular method call from diff class
		obj5.m8();
	}
	
	public static void m5() 
	{
		Demo_4 obj2=new Demo_4();	                     //1)object creation
	    System.out.println("---non static globle variable call from SRM");
		System.out.println(obj2.i);                      //2)variable call-object name.variable name		
	}
	
	
	public void m6() 
	{
		System.out.println("---non static globle variable call from NSRM");
		System.out.println(i);
	}
	
	
	
}
