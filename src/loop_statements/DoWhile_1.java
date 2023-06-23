package loop_statements;

public class DoWhile_1 
{
public static void main(String[] args) 
{
   int i=50;
   do
   {
	  System.out.println(i); 
	  i++;	  
   }
   while(i<=10);
   
   System.out.println("-----------");
   
   int X=100;
   do
   {
	   System.out.println(X);
	   X=X-5;
   }
   while(X>=1);
}
}
