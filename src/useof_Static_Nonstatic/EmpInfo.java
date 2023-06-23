package useof_Static_Nonstatic;

public class EmpInfo
{
     public static void main(String[] args) 
    {
	     Emp obj1=new Emp();
	     obj1.empName="Pooja";
	     obj1.empID=101;
	     Emp.empCEOName="abc";
	     
	     Emp obj2=new Emp();
	     obj2.empName="Rahul";
	     obj2.empID=102;
	     Emp.empCEOName="efg";
	     
	     
	     Emp obj3=new Emp();
	     obj3.empName="Ganesh";
	     obj3.empID=103;
	     Emp.empCEOName="lmn";
	     
    	 
    	 
	     obj1.empInfo();
	     obj2.empInfo();
	     obj3.empInfo();
    	 
    	 
    	 
	}
	
	
	
	
	
	
	
	
	
	
}
