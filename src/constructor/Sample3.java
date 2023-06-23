package constructor;
                         //percentage printing
public class Sample3 
{
   float num1;
   int num2;
   int num3;
   
   Sample3(float a,int b, int c)
   {
	   num1=a;
	   num2=b;
	   num3=c;
   }
	
	public void average() 
	{
		System.out.println((num1+num2)/num3*100);
	}
	
	public static void main(String[] args) 
	{
		Sample3 s1=new Sample3(40,27,100);
		s1.average();
		
	}
	
	
	
	
	
}
