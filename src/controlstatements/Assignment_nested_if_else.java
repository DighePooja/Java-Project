package controlstatements;

public class Assignment_nested_if_else
{
         public static void main(String[] args) 
         {
		         int SA=500;
		         int BA=10000;
		         
		         if(SA>=500) 
		         {
		        	    System.out.println("No delivery charges.");  
		        	 
		        	if(BA>=10000)
		        	{
		        		System.out.println("Additional 10% discount.");
		        	}
		        	else
		        	{
		        		System.out.println("No discount.");
		        	}
		        	
		        	
		        		        	 
		        	 
		         }
        	 
		         else
		         {
		        	 System.out.println("Additional 50 rs. delivery charges applied");
		         }       	        	 
        	         	        	 
         }				
	
	
}
