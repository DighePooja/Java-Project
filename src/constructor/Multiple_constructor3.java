package constructor;

public class Multiple_constructor3 
{
   int num1;
   int num2;
   
   Multiple_constructor3()
   {
	   num1=9;
	   num2=5;
	   
   }
	
	public void NSRm1() 
	{
		System.out.println("<---------------->");
		System.out.println(num1-num2+"\n"+num1/num2+"\n"+num1*num2+"\n"+num1+num2);
	}
	
	Multiple_constructor3(int a,int b)
	{
		num1=a;
		num2=b;
	}
	
	public void NSRm2() 
	{
		System.out.println("<------------->");
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1<=num2);
		System.out.println(num1>=num2);
	}	
	
	
}
