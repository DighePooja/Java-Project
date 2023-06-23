package programpractice;

     public class Sample4 
{
               //non static regular method call from same class
    	 public static void main(String[] args)
    	 {
    		 System.out.println("-----------main method----------");
    		 System.out.println("main method statement");
    		 System.out.println("to call NSRM from same class");
			 System.out.println("1) we have to creat an object of that method");
			 System.out.println("2) method call");
		
    	        // step 1- create an object
    	     Sample4 S1=new Sample4();
    	 
    	        // step 2- method call
    	     S1.m4();		 
    	 }
    	 
    	 public void m4()
    	 {
    		System.out.println("------------NSRM-----------");
    		System.out.println("NSRM statements:");
    		System.out.println("1) create an object of NSRM in main method using syntax - classname objectname=new classname(); "); 
    		System.out.println("2) then call NSRM in main method using syntax - objectname.methodname();"); 
    		 
    	 } 
    	 
    	 
}  	 
    	 
    	 
    	 
    	 
    	 
    	 

