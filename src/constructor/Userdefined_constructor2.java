package constructor;

public class Userdefined_constructor2 
{            // step1: non static globle variable declaration
   int num1;
   int num2;
   
            //step2: variable initialization(in constructor body)
   
   Userdefined_constructor2()
   {
	   num1=50;
	   num2=100;
   }
   public void m1() 
   {
	System.out.println(num1==num2);
   }
   public void m2() 
   {
	System.out.println(num1>=num2);
   }
   public void m3() 
   {
	System.out.println(num1<=num2);
   }
   public void m4() 
   {
	 System.out.println(num1!=num2);
   }
   public void m5() 
   {
	System.out.println(num1<num2);
   }
   
   
   
   
   
   
}
