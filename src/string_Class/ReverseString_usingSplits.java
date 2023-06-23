package string_Class;

public class ReverseString_usingSplits 
{
public static void main(String[] args) 
{
   String s1="PoojaDighe";
   System.out.println(s1.length());
  
   String[] ar= s1.split("");      
   
   for(int i=ar.length-1; i>=0; i--)
   {
	  System.out.print(ar[i]); 
   }
	
	
	
	
	
	
	
	
	
	
}
}
