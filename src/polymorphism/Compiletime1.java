package polymorphism;

public class Compiletime1    //Method overloading
{
   public void relational(int num1, int num2) 
   {
	System.out.println(num1>=num2);
	System.out.println(num1<=num2);
   }
	
   public void relational(int num1, int num2, String str ) 
   {
	System.out.println(num1==num2);
	System.out.println(num1!=num2);
   }
	
	
}
