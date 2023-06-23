package constructor;

public class Multiple_constructor1 
{               //User defined constructor------------->multiple constructor
      int num1;
      int num2;                 //declaration
      String name;
      
      Multiple_constructor1()
      {
    	  num1= 10;            //initialization
    	  num2= 20;		       //constructor 1---without parameter
      }
      
      Multiple_constructor1(int a, int b)
      {
    	  num1 =a;             //initialization by using local variable
    	  num2 =b;             //constructor 2--------with int,int parameter
      }
      
      Multiple_constructor1(int a,int b,String s1)
      {
    	 num1 =a;              //initialization by using local variable
    	 num2 =b;              //constructor 3---------with int int String parameter
    	 name =s1;   
      }
      
	public void m1() 
	{
		System.out.println(num1%num2);
	}
	
	public void m2() 
	{
		System.out.println(num1*num2);
	}
	
	public void m3() 
	{
		System.out.println(name+"="+(num1+num2));
	}
	
	public static void main(String[] args) 
	{
		Multiple_constructor1 obj1=new Multiple_constructor1();
		obj1.m1();
		
		Multiple_constructor1 obj2=new Multiple_constructor1(5,6);
		obj2.m2();
		
		Multiple_constructor1 obj3=new Multiple_constructor1(30,20,"Total");
		obj3.m3();	
	}
	
	
	
	
	
}
