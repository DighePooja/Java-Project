package programpractice;

public class Practice2_para_method {
	
	  public static void Sm2(float per,char grade,int rnum, int OTP)
	  {
		  System.out.println("-------------Sm2 call from the diff class--------------------");
		  System.out.println(per+"\n"+grade+"\n"+rnum+"\n"+OTP);		
	  }
	 
	  public void NSm2(String comname,String exp,String post,float packagePA ) 
	  {
		  System.out.println("----------------NSm2 call from the diff class----------------");
		  System.out.println(comname+"\n"+exp+"\n"+post+"\n"+packagePA);
      }
	
	
	
	

}
