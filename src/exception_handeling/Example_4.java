package exception_handeling;

public class Example_4 
{
public static void main(String[] args) 
{
	int [] ar={10,20,30,40,50};
	
	try
	{
		System.out.println(ar[5]);
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("StringIndexOutOfBoundsException handelled");
	}
	catch(ArithmeticException e)
	{
		System.out.println("ArithmeticException handelled");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBoundsException handelled");
	}
	
	System.out.println(ar[0]);
	System.out.println(ar[1]);
	System.out.println(ar[2]);
	System.out.println(ar[3]);
}
}