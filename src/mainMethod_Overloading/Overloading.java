package mainMethod_Overloading;

public class Overloading 
{
	int a=10;
	int b=15;
public static void mainmethod(int num1, int num2)  
{
	Overloading s=new Overloading();
	System.out.println("variable call: "+s.a+" ,"+s.b);
   	
   	System.out.println("addition of tow numbers: "+ (num1+num2));
}

public static void mainmethod(int no1, int no2, int no3) 
{
	Overloading s1=new Overloading();
	System.out.println("variable call: "+s1.a+" ,"+s1.b);
		
	
	System.out.println("multiplication of three numbers: " + (no1 + no2 + no3));
}
public static void mainmethod(String name)
{
	System.out.println("Name: "+ name);
	mainmethod(10,20);
	mainmethod(10,20,30);
	
		
}
public static void main(String[] args) 
{
	mainmethod("Pooja");
}
}
