package logical_program;

public class Duplicate_NumberInArray 
{
    public static void main(String[] args) 
    {
	   int []ar= {10,20,30,50,10,90,50,80,90};
	   
	   for(int i=0;i<=ar.length-1;i++)
	   {
		   for(int j=i+1; j<=ar.length-1; j++)
		   {
			   if (ar[i]==ar[j])
			   {
				   System.out.println("Duplicate numbers are: "+ar[j]);
			   }
		   }
	   }
    	
    	
	}
}
