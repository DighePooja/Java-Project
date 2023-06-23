package programpractice;

public class Sample5
{                    //call NSRM from diff class-Sample6
      public static void main(String[] args) 
    
        {
    	  System.out.println("-----------------main method statements---------------");
	        System.out.println("main method statement");	        
    	    System.out.println("to call NSRM from diff class");    	    
    	    System.out.println("step1-create an object of class");   	    
    	    System.out.println("step2-method call");
    	  
    	   System.out.println(" ----------------method m5 statements-----------------");
    	            // create an object of m5
    	    Sample6 S2=new Sample6();
    	    		//method call m5
    	    S2.m5();	
    	    System.out.println("-----------------method m6 statements-----------------");        
    	           // create an object of m6
    	    Sample6 S3=new Sample6();
    	           // method call m6
    	    S3.m6();
         }
	
	
	
	
	
	
}	
	
	
	
	
	

