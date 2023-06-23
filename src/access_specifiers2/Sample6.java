package access_specifiers2;

import access_specifiers1.Demo6;

public class Sample6 extends Demo6     
{	
 
	
public Sample6(int i) {
		// TODO Auto-generated constructor stub
	}

public Sample6(int i, int j) {
	// TODO Auto-generated constructor stub
}

public Sample6() {
	// TODO Auto-generated constructor stub
}



public static void main(String[] args) 
  {
	  Sample6 s1=new Sample6();
	  s1.m1();
	  
	  Sample6 s2=new Sample6(10);
	  s1.m2();
	  
	  Sample6 s3=new Sample6(5,6);
	  s1.m3();
	  
	  System.out.println(s1.num1);
	  System.out.println(s1.num2); 
	  
  }
        
	
	
	
	
	
}
