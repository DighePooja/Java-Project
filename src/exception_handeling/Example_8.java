package exception_handeling;

public class Example_8 {
public static void main(String[] args) {
	
	String [] ar= {"Pooja","Dighe"};     //index 1
	
	int[] arr= {5,6,7,8,9};
	
	String str= "Software Testing";  //index 0 1
	
	try
	{
		try                                    //int[] arr= {5,6,7,8,9};
		{
			System.out.println(arr[5]);
			System.out.println(ar[0]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("(int)ArrayIndexOutOfBoundsException handeled");
			System.out.println(arr[4]);	
		}
		
		try                                       //String str= "Software Testing";
		{
		  System.out.println(str.charAt(17));	
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException handeled");
			System.out.println(str.charAt(0));
		}
	
	  System.out.println(ar[9]);	
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("(String)ArrayIndexOutOfBoundsException handeled");
	   System.out.println(ar[0]);   
	}
}
}
