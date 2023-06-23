package methods;

public class Nsample2 
{
	
                               //call NSRM from diff class(Nsample3)
	public static void main(String[] args) 
	  
	       //call non static regular method from diff class.
	{
		 System.out.println("main method statement");
		
		                                        //Object creation
		 Nsample3 s2= new Nsample3();
		 
		                                        //Method call
		 s2.M1();
		 s2.M2();
	 }
	
	
	
	
	
	
	
	
	
	
}
