package arrays;

public class Demo2 //single dimentional array --int
{
    public static void main(String[] args) 
    {
	  // int[] ar=new int [5];
       int[] ar= {5,6,7,9,12,15};
    		   
       System.out.println(ar.length);
       System.out.println(ar.length-1);
       System.out.println(ar[0]);
       System.out.println("-------");
    	
       for(int i=0; i<=5; i++)
       {
    	   System.out.println(ar[i]);
       }
    	System.out.println("-----");
    	
    	for(int i=ar.length-1; i>=0; i--)
    	{
    		System.out.println(ar[i]);
    	}
    	
    	
    	
	} 
	
}
