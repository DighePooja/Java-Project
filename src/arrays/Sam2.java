package arrays;

public class Sam2 
{
public static void main(String[] args) 

{                 //  0         1         2         //row index
     int ar[][]= { { 1,2,3 }, {4,5,6}, {7,8,9}};    //declare initialize in one step
                 //  0 1 2     0 1 2    0 1 2       //coloum index 
     
     for(int i=0; i<=2; i++)
     {
    	 for(int j=0; j<=2; j++)
    		 {
    			System.out.print(ar[i][j]+" "); 
    		 }
    	 System.out.println();
     }
    	 
}
}
