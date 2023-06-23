package arrays;

public class Exa1_String 
{
   public static void main(String[] args) 
   {
	   //Step-1 Array declaration

		String ar[]=new String[5];              //object creation of array
		
	   //Step-2 Array initialization
		
	    ar[0]="megh";
	    ar[1]="Mahesh";
	    ar[2]="Manish";
	    ar[3]="Mohan";
	    ar[4]="Mayank";
	    
	   //Step-3 Usage  
	    
	   System.out.println(ar[0]);
	   System.out.println(ar[1]);
	   System.out.println(ar[2]);
	   System.out.println(ar[3]);
	   System.out.println(ar[4]);
	    
	   System.out.println("<-------------------->");
	    
	   //To find out size of array-(last number)
	   System.out.println(ar.length); 
	   
	   //To find out index of array--
	   System.out.println(ar.length-1);
	   
	   //to print all info of string array
	   for(int i=0; i<=ar.length-1; i++)
	   {
		   System.out.println(ar[i]);
	   }
	   
	   System.out.println("----------------");
	   //To print all information from String array
	   
	   for(int i=0; i<=4; i++)
	   {
		   System.out.println(ar[i]);
	   }
	   
	   
	    
	    
   }
}	
	

