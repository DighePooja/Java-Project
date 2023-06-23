package programpractice;

public class Control_statement_else_if 
{ 
      public static void main(String[] args) 
      {
    	  int PEScore=950;
    	  int MEScore= 1150;
    	  
    	  if (PEScore>=900)
    	  {
    		      System.out.println("Eligible for mains exam");
    		  
    		  if(MEScore>=1000)
    		  {
    			  System.out.println("Qualify mains exam");
    		  }
    		  else
    		  {
    			  System.out.println("Not eligible for interview");
    		  }

    		  
    	  }
    	  
    	  else
    	  {
    		  System.out.println("Not qualify preliminary exam");  
    	  }
    	  
		
    	  
    	  
    	  
    	  
    	  
	  }
	
	
	
	
	
	
	
	
	
	
}
