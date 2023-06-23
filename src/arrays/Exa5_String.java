package arrays;

public class Exa5_String 
{
public static void main(String[] args) 

{               //  0      1     2       3
   String ar[]= {"Pooja","PD","Arati","Anni"};         //declaration and initialization in one step
		   
   System.out.println(ar.length);  //length of data
		   
   System.out.println(ar[1]);   //print one index
	
   for(int i=0; i<=ar.length-1; i++)
   {                                       //to print all String array info 
	   System.out.println(ar[i]);
   }
	
}
}
