package logical_program;

public class Duplicate_String 
{
    public static void main(String[] args) 
    {
	  String [] ar= {"pooja","anni","aaru","tanu","pooja","anni"};
	  
	  for(int i=0; i<=ar.length-1; i++)
	  {
		  for(int j=i+1; j<=ar.length-1; j++)
		  {
			  if (ar[i]==ar[j])
			  {
				  System.out.println("Duplicate String is: "+ar[j]);
			  }   
		  }
	  }
	   
	}
}
