package exception_handeling;

public class Example_7 {
public static void main(String[] args) {
	
	String s1="velocity";
	int[] ar= {10,20,30,40,50};
	
	try
	{
		System.out.println(s1.charAt(8));
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("StringIndexOutOfBoundsException handled");
		System.out.println(s1.charAt(7));
	}
	
	try
	{
		System.out.println(ar[5]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBoundsException handeled");
		System.out.println(ar[4]);
	}
}
}
