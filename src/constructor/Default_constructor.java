package constructor;

public class Default_constructor 
{
     public static void main(String[] args)
     {
		// Call the constructor of same class
    	 
    	 System.out.println("main method statement");
    	 
    	 Default_constructor s1=new Default_constructor();               //4th parameter is constructor call
    	 s1.m1();                                                        //default constructor --->
    	                                                                 //syntax--->classname(); ---> Default_constructor();    	 
    	 Default_constructor_2 s2=new Default_constructor_2();     //constructor_2()--------->constructor call
    	 s2.m2(); 
    	 
	 }
	
	public void m1() 
	{
		System.out.println("Running non static regular method from same class");
	}
	
	
	
	
	
	
	
	
	
}
