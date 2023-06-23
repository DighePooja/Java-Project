package controlstatements;

public class ConditionalS_nested_if 
{
      public static void main(String[] args)
      
      {
    	     int PEM=350;
    	     int MEM=850;
    	     
    	     if(PEM>=300)
    	  
    	     {
    	       System.out.println("eligible for mains exam"); 
    	    	
    	    	   if(MEM>=900)
    	    	     {
    	    	     	System.out.println("Got selected");
    	    	     }
    	    	
    	    	   else
    	           	 {
    	    	     	System.out.println("Fail");
    	    	     }
    	      	    	    	    	
    	    	
    	     }
      
    	     else
    	     {
    	    	 System.out.println("Not eligible for mains exam");
    	     }
    	     
    	     
      
    	    	 
    	    	 
    	    	 
    	    	 
    	    	 
    	    	 
    	    	 
      }
      
	
	
	
	

}