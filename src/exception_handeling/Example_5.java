package exception_handeling;

public class Example_5 {
public static void main(String[] args) {
	
	String s1= "POOJA";
	
	System.out.println(s1.charAt(4));
	
	try
	{
		System.out.println(s1.charAt(5));
	}
	catch(Exception e)
	{
	   System.out.println("Generic exception handelled");
	}
	
	System.out.println(s1.indexOf('A'));
}
}
