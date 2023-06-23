package Program;

public class Operator
{
	
                                            //class body
	
	public static void main(String[] args)  //main method
	
	{                                       //Operators//
		int a=10;
		int b=20;
		//Arithmatic Operators-------->  + - * / 
		
		System.out.println("----------------------Arithmatic operators----------------------");
		
	    System.out.println("sum of a and b is:"+(a+b));
	    System.out.println("diff of a and b is:"+(a-b));
	    System.out.println("mul of a and b is:"+(a*b));
	    System.out.println("div of a and b is:"+(a/b));
		
	  //Relational Operators--------> == >= <= < > !=
	    
	    System.out.println("----------------------Relational operators----------------------");
	    
	    System.out.println(a==b); //false
	    System.out.println(a<b);  //false
	    System.out.println(a>=b); //false
	    System.out.println(a<=b); //false
	    System.out.println(a!=b); //false
	    
	  //Logical Operators-------->  && || !
	    
	    System.out.println("---------------------Logical operators--------------------------");
	    
	    boolean x=true;
	    boolean	y=false;	
	    
	    System.out.println(x && y);  //false
	    System.out.println(x || y);  //true
	    System.out.println(!x);      //false
	    System.out.println(!y);      //true
	    
	  //Incremental/Decremental Operators-------->  ++  --
	    
	    System.out.println("---------------Increment/Decrement operators---------------------------");
	    
	   a=10;
	   a++; //a=a+1
	   System.out.println(a);
	   b=20;
	   b--;	   
	   System.out.println(b);
	    
	    
	}

}


