package Program;

public class PriceOfPetrol 
{
   static int a=1000;
  static float b=110.5f;
   int no1=2000;
   float no2= 210.5f;
   
 
   public static void main(String[] args)
  
   {
	System.out.println("petrol of rs. 1000");
    System.out.println(a/b);  
    
    PriceOfPetrol s1=new PriceOfPetrol();
    s1.m1();
   }
  
   public void m1() 
   {
	System.out.println("petrol of rs. 2000");
	System.out.println(no1/no2);
   }
   
	
	
}
