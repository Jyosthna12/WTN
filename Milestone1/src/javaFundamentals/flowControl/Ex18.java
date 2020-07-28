package javaFundamentals.flowControl;

public class Ex18 {
public static void main(String[] args)
{
	int n=Integer.parseInt(args[0]);
	int temp=n;
	int c=0,r;
	while(temp!=0)
			{
		

	r=temp%10;
	c=c*10+r;
	temp=temp/10;
}
if(n==c)
	System.out.println(n+"is a palindrome");
else
	System.out.println(n+"is not  a palindrome");
}
}
	
	
	
	
	
	
	
	
	
	
