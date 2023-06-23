package exception_handeling;

public class Example_3 
{
public static void main(String[] args) 
{
    int num1=10;
    int num2=0;
    
    int div=num1/num2;
    
    try 
    {
      System.out.println(div);
    }
	catch(ArithmeticException e)
    {
		System.out.println("exception Handelled");
		System.out.println();
    }
	System.out.println("hi");
	
	
	
	
	
	
	
}
}
