package logical_program;

public class ReplaceCharacter_InString
{
    public static void main(String[] args) 
    {
	   String s1="#c2342^&^%a$pge452mini";
	   
	   System.out.println(s1.replaceAll("[a-z]","0")); //to replace the charactr 
	   
	   System.out.println(s1.replaceAll("[^a-z]","")); //to replace symbol and special charactr
	   
	   System.out.println(s1.replaceAll("[0-9]", "")); //to replace int/digit in string
	   
	   System.out.println(s1.replaceAll("[^0-9]", "")); //to replace all symbol nd sp. char other than digit
	}
}
