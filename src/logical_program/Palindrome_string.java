package logical_program;

public class Palindrome_string {
	
	public static void main(String[] args) {
	  String org="mom";
	  String rev="";
	  
	  for(int i=org.length()-1; i>=0; i--)
	  {
		  rev=rev+org.charAt(i);
	  }
	  //System.out.println(rev);
	  
     if(org.equals(rev))
     {
    	 System.out.println("Given string is palindrome: "+org);
     }
     else
     {
    	 System.out.println("Given string is not a palindromes: "+org);
     }	  
}
}
