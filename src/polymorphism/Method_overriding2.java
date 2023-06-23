package polymorphism;
                             //method overriding ----->eg of compile time polymorphism

public class Method_overriding2 extends Methodoverriding1
{
   public void Bike()
   {
	 System.out.println("Bike=FZ v3");
   }
	
   public void Money() 
	{
	  System.out.println("money=3L");	
	}
	
	public void Car() 
	{
	  System.out.println("Car=creta");	
	}
	
	//public void Home() 
	//{
	//  System.out.println("Home=banglo");	
	//}
	
	
	public static void main(String[] args)
	{
		Method_overriding2 s1=new Method_overriding2();
		s1.Money();
		s1.Car();
		s1.Home();
		s1.Bike();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
