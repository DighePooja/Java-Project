package logical_program;

public class Palindrome_num
{
public static void main(String[] args) {  //12121 --12121 --mom madam dad
	
	int orgnum=12541; 
	int revnum=0;
	
	for(int i=orgnum; i>0; i=i/10)
	{
		int rem= i%10;
		revnum= revnum*10+rem;		
	}
	//System.out.println("Reverse num: "+revnum);
	
	if(orgnum==revnum)
	{
		System.out.println("given num is palindrome: "+orgnum);
	}
	else
	{
		System.out.println("Given num is not palindrome: "+orgnum);
	}
}
}
