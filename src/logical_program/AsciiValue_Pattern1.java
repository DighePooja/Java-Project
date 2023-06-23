package logical_program;

public class AsciiValue_Pattern1 
{
   public static void main(String[] args) 
   {
	 char ch='A';
	 int space=4;
	 for(int i=1;i<=5;i++)
	 {
		 for(int k=1;k<=space;k++)
		 {
			 System.out.print(" ");
		 }
		 for(int j=1;j<=i;j++)
		 {
			 System.out.print(ch+" ");
		 }
		 System.out.println();
		 space--;
		 ch++;
	 }   
   }
}
