package constructor;

public class Sample4 
{
   int no1;
   int no2;
   int no3;
	
   Sample4(int a,int b,int c)
   {
	   no1=a;
	   no2=b;
	   no3=c;
   }
	
   public void m1() 
   {
	   System.out.println(no1+no2*no3);
	   System.out.println(no1-no2/no3);
   }
	
   
   public static void main(String[] args)
   {
	   Sample4 s1=new Sample4(5,6,9);
	   s1.m1();
	   System.out.println("--------");
	   
	   Sample5 s2=new Sample5(10,20);             //diff class sample5
	   s2.m2();
	   System.out.println("--------");
	   
	   Sample5 s3=new Sample5(30,50);             //diff class sample5
	   s3.m3();
   }
	

	
	
	
	
	
	
	
	
}
