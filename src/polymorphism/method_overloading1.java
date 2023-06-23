package polymorphism;
                                //compile time polymorphism
public class method_overloading1 
{
   
   public void addition(int num1, int num2) 
   {
	System.out.println(num1+num2);   
   }
	
   public void addition(int num1, int num2,int num3 ) 
   {
	System.out.println(num1+num3+num3);
   }
	
   
	public static void main(String[] args) 
	{
		method_overloading1 s1=new method_overloading1();
		s1.addition(10,20);
		s1.addition(5,6,9);
		
	}
	
	
	
}
