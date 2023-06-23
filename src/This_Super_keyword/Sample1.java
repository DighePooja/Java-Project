package This_Super_keyword;

public class Sample1 extends Sample2
{
	int a=10;
	
public static void main(String[] args) {
		
		
		Sample1 s1=new Sample1 ();
		s1.m1();
}
	
   public void m1()
   {
	   
	int a=20;
	
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
   }
}
