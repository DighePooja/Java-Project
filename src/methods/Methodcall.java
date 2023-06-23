package methods;

public class Methodcall 
                                   //call static regular method from same class

    {
	   public static void main(String[] args)
	  
	   // Main
	   {
		   System.out.println("main method statement");
		   
		   Methodcall.regularmethod1();
		   
	   }

	   public static void regularmethod1()
	   
	   { 
		   System.out.println("running static regular method");
	   
	   }
    }
