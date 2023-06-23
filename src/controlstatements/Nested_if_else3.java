package controlstatements;

public class Nested_if_else3 
{
  public static void main(String[] args) 
  {
	 int marks=70;
	 if(marks>=40)
	 {
		 System.out.println("Pass");
	 
	      if(marks>=60)
	      {
	    	  System.out.println("First class");
	      }
	      
	      else
	      {
	     	  System.out.println("no first class");
	      }
	      
	      if(marks>=70)
	      {
	    	  System.out.println("distinction");
	      }
	      
	      else 
	      {
	    	 System.out.println("no Distinction");  
	      }
	      
	 }
	   
	   else
	    {
	    	  System.out.println("fail");
	    }
  }
	
	
	
	
	
	
	
}
