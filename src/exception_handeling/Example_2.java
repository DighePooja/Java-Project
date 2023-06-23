package exception_handeling;

public class Example_2 
{
public static void main(String[] args) 
{
   int[] ar= {10,20,30,40,50};
   
   try 
   {
     System.out.println(ar[5]);    //ArrayIndexOutOfBond Exeption 
   }                               //Risky code
   catch(ArrayIndexOutOfBoundsException e)
   {
	   System.out.println("Exception handelled");
	   System.out.println(ar[3]);
   }
	
	System.out.println("exeption handelling");
	
	
	
	
	
	
	
	
	
	
	
}
}
