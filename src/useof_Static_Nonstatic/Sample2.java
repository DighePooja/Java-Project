package useof_Static_Nonstatic;

public class Sample2 
{
  public static void main(String[] args) 
  {
	Sample1 s1=new Sample1();
	s1.StudentName="Mayur";
	s1.StudentRollnum=101;
	Sample1.PrincipalName="Xyz";
	  
	Sample1 s2=new Sample1();
	s2.StudentName="Manish";
	s2.StudentRollnum=102;
	Sample1.PrincipalName="Xyz";
	
	Sample1 s3=new Sample1();
	s3.StudentName="Mahesh";
	s3.StudentRollnum=103;
	Sample1.PrincipalName="Abc";
	  
	s1.StudentInfo();
	s2.StudentInfo();
	s3.StudentInfo();
	  
  }
}
