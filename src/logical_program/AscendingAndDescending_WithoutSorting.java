package logical_program;

public class AscendingAndDescending_WithoutSorting 
{
   public static void main(String[] args) 
   {
	   int[] ar= {10,14,12,16,13,11,15};
	   
	   int temp=0;
	   for(int i=0;i<ar.length;i++)
	   {
		   for(int j=i+1;j<ar.length;j++)
		   {
			   if(ar[i]>ar[j])
			   {
				   temp=ar[i];
				   ar[i]=ar[j];
				   ar[j]=temp;
			   }
		   }
			  System.out.println(ar[i]);   
	   }
   }
}
