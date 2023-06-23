package star_pattern;

public class All_Star_Pattern 
{
	
public static void main(String[] args) {
	m1();  
	m2();
	R1();
	R2();
	m3();
	m4();
	R3();
	R4();
	m5();
	m6();
	m7();
	m8();
	R5();
	R6();
	m9();
	
	
}
public static void m1() {
	int star=1;
	for(int i=1; i<=5; i++)
	{
		       //2
		for(int j=1; j<=star; j++)//"*"
		{
			System.out.print("* ");
		}
		System.out.println();
		star++;
	}
	System.out.println("----------");
}
public static void m2() {
	int star=5;
	for(int i=1; i<=5; i++)
	{
		for(int j=1; j<=star; j++)
		{
			System.out.print("* ");
		}
		System.out.println();
		star--;
	}
	System.out.println("-----------");
}
public static void R1() {
	int star=1;
	for(int i=1; i<=5; i++)
	{
		for(int j=1; j<=star; j++)
		{
			System.out.print("* ");
		}
		System.out.println();
		star++;
	}
	
}
public static void R2() {
	int star=5;
	for(int i=1; i<=5; i++)
	{
		for(int j=1; j<star; j++)
		{
			System.out.print("* ");
		}
		System.out.println();
		star--;
	}
	System.out.println("-----------");
}
public static void m3() {
	int star=1;
	int spaces=8;
	
	for(int i=1; i<=5; i++)
	{
		for(int k=1; k<=spaces; k++)
		{
			System.out.print(" ");
		}
		for(int j=1; j<=star; j++)
	    {
			System.out.print("* ");
	    }
		System.out.println("");
		star++;
		spaces=spaces-2;
		
	}
	System.out.println("------------");
}
public static void m4() {
	int star=5;
	int spaces=0;
	
	for(int i=1; i<=5; i++)
	{
		for(int k=1; k<=spaces; k++)
		{
			System.out.print(" ");
		}
		for(int j=1; j<=star; j++)
	    {
			System.out.print("* ");
	    }
		System.out.println("");
		star--;
		spaces=spaces+2;
		
    }
	System.out.println("------------");
}
public static void R3() {
	int star=1;
	int spaces=8;
	
	for(int i=1; i<=5; i++)
	{
		for(int k=1; k<=spaces; k++)
		{
			System.out.print(" ");
		}
		for(int j=1; j<=star; j++)
	    {
			System.out.print("* ");
	    }
		System.out.println("");
		star++;
		spaces=spaces-2;
		
	}
}
public static void R4() {
	int star=4;
	int spaces=2
			;
	
	for(int i=1; i<=5; i++)
	{
		for(int k=1; k<=spaces; k++)
		{
			System.out.print(" ");
		}
		for(int j=1; j<=star; j++)
	    {
			System.out.print("* ");
	    }
		System.out.println("");
		star--;
		spaces=spaces+2;
		
    }
	System.out.println("------------");
}
public static void m5() 
{
    int spaces=4;
    for(int i=1; i<=5; i++)
    {
    	for(int k=1; k<=spaces; k++)
    	{
    		System.out.print(" ");
    	}
    	for(int j=1; j<=5; j++)
    	{
    		System.out.print("* ");
    	}
    	System.out.println("");
    	spaces--;
    }
    System.out.println("------------");
}
public static void m6() 
{
    int spaces=0;
    for(int i=1; i<=5; i++)
    {
    	for(int k=1; k<=spaces; k++)
    	{
    		System.out.print(" ");
    	}
    	for(int j=1; j<=5; j++)
    	{
    		System.out.print("* ");
    	}
    	System.out.println("");
    	spaces++;
    }
    System.out.println("------------");
}
public static void m7() {
	int star=1;
	int spaces=4;
	
	for(int i=1; i<=5; i++)
	{
		for(int k=1; k<=spaces; k++)
		{
			System.out.print(" ");
		}
		for(int j=1; j<=star; j++)
		{
			System.out.print("* ");
		}
		System.out.println("");
	   spaces--;
	   star++;
	}
	System.out.println("-------------");
}
public static void m8() {
	int star=5;
	int spaces=0;
	
	for(int i=1; i<=5; i++)
	{
		for(int k=1; k<=spaces; k++)
		{
			System.out.print(" ");
		}
		for(int j=1; j<=star; j++)
		{
			System.out.print("* ");
		}
		System.out.println("");
	   spaces++;  
	   star--;   
	}
	System.out.println("------------");
}
public static void R5() {
	int star=1;
	int spaces=4;
	
	for(int i=1; i<=5; i++)
	{
		for(int k=1; k<=spaces; k++)
		{
			System.out.print(" ");
		}
		for(int j=1; j<=star; j++)
		{
			System.out.print("* ");
		}
		System.out.println("");
	   spaces--;
	   star++;
	}
}
public static void R6(){
	int star=4;
	int spaces=1;
	
	for(int i=1; i<=5; i++)
	{
		for(int k=1; k<=spaces; k++)
		{
			System.out.print(" ");
		}
		for(int j=1; j<=star; j++)
		{
			System.out.print("* ");
		}
		System.out.println("");
	   spaces++;  
	   star--;   
	}
	System.out.println("------------");
}
public static void m9() 
{
   int star=5;
   int space=0;
   for(int i=1; i<=5; i++)
   {
	   for(int j=1; j<=star; j++)
	   {
		   System.out.print("*");
	   }
	   for(int k=1; k<=space; k++)
	   {
		   System.out.print(" ");
	   }
	   for(int j=1; j<=star; j++)
	   {
		   System.out.print("*");
	   }
	   System.out.println("");
	   star--;
	   space=space+2;
	   
   }
   n9();
}
public static void n9() 
{
   int star=2;
   int space=6;
   for(int i=1; i<=4; i++)
   {
	   for(int j=1; j<=star; j++)
	   {
		   System.out.print("*");
	   }
	   for(int k=1; k<=space; k++)
	   {
		   System.out.print(" ");
	   }
	   for(int j=1; j<=star; j++)
	   {
		   System.out.print("*");
	   }
	   System.out.println("");
	   star++;
	   space=space-2;
	   
   }
   System.out.println("-----------");
}












}

