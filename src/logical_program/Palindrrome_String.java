package logical_program;

public class Palindrrome_String {
	public static void main(String[] args) {
		
		
		String org="velocity";
		String rev="";
		for(int i=org.length()-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);
		}
		//System.out.println(rev);
		
		if(rev.equals(org))
		{
			System.out.println("Given String is palindrome");
		}
		else
		{
			System.out.println("Given String is not palindrome");
		}
	}
}
