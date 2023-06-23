package access_specifiers1;

public class Demo6 
{
  protected int num1;
  protected int num2;
  
  
  protected  Demo6()
  {
    num1=20;
    num2=10;
  }
   
  protected  Demo6( int a)
  {
	  num1=a;
	  
  }
  
  protected Demo6(int x, int y)
  {
	 System.out.println(); 
  }
  
  protected  void m1() 
  {
	System.out.println(num1>=num2);
  } 
	
  protected  void m2() 
  {
	System.out.println(num1*num1);
  }
  
  protected  void m3() 
  {
	System.out.println(num1*num2);
  }
  
  
  

}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  