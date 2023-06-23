package inheritance_practice;

public class Test3 
{
    public static void main(String[] args) 
    {
	   Son1 s1=new Son1();
	   s1.Bike();
	   s1.Car();
	   s1.Home();
	   s1.Money();
	   
	   System.out.println("-------");
	   
	   Son2 s2=new Son2();
	   s2.Laptop();
	   s2.Car();
	   s2.Home();
	   s2.Money();
	   
	   System.out.println("-------");
	   
	   Son3 s3=new Son3();
	   s3.Mobile();
	   s3.Car();
	   s3.Home();
	   s3.Money();
	   
	   
	}
}
