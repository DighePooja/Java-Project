package exception_handeling;

public class Example_6 {
public static void main(String[] args) {
	
	
	int a=10;
	int b=0;
	int c=0;
		
	//System.out.println(a);
	try
	{
		System.out.println(c=a/b);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println();
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println();
	}
	catch(Exception e)
	{
		System.out.println("Generic Exception handeled ");
	}
	System.out.println(a);
	System.out.println(b);
	
	
}
}
