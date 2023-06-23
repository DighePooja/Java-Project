package star_pattern;

public class Triangle_1{
public static void main(String[] args){ 
	
	  m1();
	  m2();
	  m3();
}
public static void m1() {     //1st cordrant or half pyramid
	
int star=1;
for(int i=0; i<=4; i++)            //raw
{
	    for(int j=1; j<=star; j++)   //star/cols
	    {
	    	System.out.print("* ");
	    }
	    System.out.println();
	    star++;
}
System.out.println("----------");
}

public static void m2() {    //
	int star=1;
for(int i=0; i<=4; i++)
{
	  for(int j=4; j>=star; j--) 
	  {
		 System.out.print("* ");   //*****
		                           //****
	  }                            //***
		                           //**
	System.out.println();	       //*
}
System.out.println("----------");
}
public static void m3() {
	int ch='A';
	
	
	for(int i=1; i<=5; i++)
	{
		
		for(int j=1; j<=i; j++)
		{
			System.out.print(ch+"  ");
			ch++;
		}
		System.out.println();
		;
		
	}
}
}










