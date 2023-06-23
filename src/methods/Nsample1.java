package methods;

public class Nsample1
{
	                    //NSRM call from same class

       public static void main(String[] args) 
       
       {
	      System.out.println("main method statement.");
	   
          Nsample1 S1= new Nsample1();                   //Step 1: Object creation
          
          S1.m1();                                  //Method call
          S1.m1();
       } 
       
      
       public void m1()
      
       {
		System.out.println("non static regular method m1 call from same class ");
	   }
       
       
       




}










