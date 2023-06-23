package logical_program;

public class Diff_info_printing
{
public static void main(String[] args) {
	
	int[] ar1= {10,20,50,90,73,10};
	int[] ar2= {10,20,52,19,73,10};
	
	for(int i=0; i<=5; i++)
	{
		if (ar1[i]!=ar2[i])
		{
		  System.out.println(ar1[i]+" "+ar2[i]);
		}
	}
	
}
}
