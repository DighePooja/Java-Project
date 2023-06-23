package arrays;

public class Example2_int  
{
public static void main(String[] args) 
{
	  //Step1- array declaration
	  int ar1[]=new int[10];
	  
	  //step2-array initialization
	  
	  ar1[0]=101;
	  ar1[1]=102;
	  ar1[2]=103;
	  ar1[3]=104;
	  ar1[4]=105;
	  
	  //Step3-usage
	  
	  System.out.println(ar1[0]);
	  System.out.println(ar1[1]);
	  System.out.println(ar1[2]); //-----------
	  System.out.println("------------");
	  //to find out the length of array
	  
	  System.out.println(ar1.length);
	  
	  //to find out index of array
	  System.out.println("-------------");
	  
	  for(int i=0; i<=ar1.length-1; i++)
	  {
		  System.out.println(ar1[i]);
	  }
	  
	  
}
}
