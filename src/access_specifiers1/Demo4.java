package access_specifiers1;
                       //Protected Access specifier---------->scope remains for perticular package --to access diff package- inheritance perform
public class Demo4 
{
     protected int num1;
     protected  int num2;
     
     protected Demo4()
     {
    	 num1=5;
    	 num2=6;
     }
	
     public static void main(String[] args)
    {
	     Demo4 d1=new Demo4();
	     d1.add();
	}
	
     protected void add() 
	{
	 System.out.println(num1+num2);	
	}
	
	
	
	
	
	
	
	
}
