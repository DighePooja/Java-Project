package arrays;

public class Sam1_2row_3cols 
{
   public static void main(String[] args) 
   {  //    0  1  2
	  // 0  10 20 30
	  // 1  40 50 60 
	   
	  int ar[][]=new int[2][3];        //declaration
   
      ar[0][0]=10;
      ar[0][1]=20;
      ar[0][2]=30;
      ar[1][0]=40;                     // Initialization
      ar[1][1]=50;
      ar[1][2]=60;
      
      System.out.println(ar[1][2]);    //usage
      
      System.out.println("----------------"); //for print all information from 2*3 array
      
      for(int i=0; i<=1; i++)
      {
    	  for(int j=0; j<=2; j++)
    	  {
    		  System.out.print(ar[i][j]+" ");
    	  }
    	  System.out.println();
      }
      
      
   }
}
