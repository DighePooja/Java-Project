package logical_program;

public class DuplicateNum_FromArray 
{
	public static void main(String[] args) {
		
		int[] ar1= {10,20,50,90,73,80};
		int[] ar2= {10,20,52,19,73,80};
		
		for(int i=0; i<=5; i++)
		{
			if (ar1[i]==ar2[i])
			{
			  System.out.println(ar1[i]+" "+ar2[i]);
			}
		}
		
	}
}
