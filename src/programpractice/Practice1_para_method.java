package programpractice;

public class Practice1_para_method {
                      /////methods with parameter/////
	public static void main(String[] args) 
	{
	    System.out.println("-------------static regular method Sm1 call from same and diff class----------------");
		Sm1("Pooja",109);
		
		Practice1_para_method obj1=new Practice1_para_method();    ///1) object
		obj1.NSm1("Pooja Dighe",109,"Automation",95,95.5f);
		
		Practice2_para_method.Sm2(85.5555f,'A',999,1234);
		
		Practice2_para_method obj2=new Practice2_para_method();
		obj2.NSm2("Topnotch chemicals pvt. ltd.","1 year","R & D",1.8f);
		
	}

    public static void Sm1(String name,int id) 
    {
		System.out.println(name+"\n"+id);    
	}
               
    public void NSm1(String sname,int rollnum, String sub, int marks, float per) 
    {
    	System.out.println("---------------------NSm1 call from the same class------------------------");
		System.out.println(sname+"\n"+rollnum+"\n"+sub+"\n"+marks+"\n"+per);
	}








}

