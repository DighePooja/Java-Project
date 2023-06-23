package logical_program;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_SecondLargest 
{
   public static void main(String[] args) 
   {
	   ArrayList arl=new ArrayList();
	   
	   arl.add(101);
	   arl.add(104);
	   arl.add(105);
	   arl.add(102);
	   arl.add(106);
	   arl.add(103);
	   arl.add(107);
	   arl.add(109);
	   arl.add(108);

	   System.out.println(arl.size());
	   System.out.println(arl);
	   Collections.sort(arl); 
	   System.out.println(arl);

	   System.out.println("Smallest Num is: "+arl.get(0));
	   System.out.println("Largest num is: "+arl.get(arl.size()-1));
	   System.out.println("Third Largest Num is: "+arl.get(arl.size()-3));
   }
}
