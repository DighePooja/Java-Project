
package logical_program;

public class Reverse_String1 
{
	public static void main(String[] args) 
    {
         String org="POOJA";  //0 1 2 3 4
         String rev="";
		  
                         
		  for(int i=org.length()-1; i>=0; i-- ) 
		  {
			  rev=rev+org.charAt(i);        
			  
		  }
		  
		  System.out.println(rev);  
		
		
	}
	
	
	
	
	
	
	
}
