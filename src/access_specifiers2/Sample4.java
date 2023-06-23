
package access_specifiers2;

import access_specifiers1.Demo4;

public class Sample4 extends Demo4

{
  public static void main(String[] args) 
  {
	  Sample4 s1=new Sample4();                 //protected class members access form diff package by performing inheritance
	  s1.add();
	  System.out.println(s1.num1);
	  System.out.println(s1.num2);
  }
	
	
	
	
}
