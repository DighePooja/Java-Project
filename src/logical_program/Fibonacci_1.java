package logical_program;

public class Fibonacci_1
{                                                //a b
public static void main(String[] args) { //0 1 | 1 2 3 5 8 13 21 34 55.....
	
	int a=0 ,b=1, c;
	System.out.print(a+" "+b+" ");
	
	for(int i=1; i<=9; i++)
	{
		c=a+b;   //5
		System.out.print(c+" ");
		  
		a=b;  //  2              
		b=c;  //  3                                                                                                                            
	}
	
}
}
///        