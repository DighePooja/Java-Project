package abstract_concrete_Class;

public class Sample2_concreate extends Sample1_abstact
{
       public void m1() 
       {
		   System.out.println("method m1 complete in concreate class");
	   }
       public void m2() 
       {
		   System.out.println("method m2 complete in concreate class");
	   }
       
       
       
       public static void main(String[] args) 
       {
    	   Sample2_concreate s1=new Sample2_concreate();
    	   
    	   s1.m1();
    	   s1.m2();
    	   s1.m3();
    	   s1.m4();
	   }
}
