package javaFundamentals.flowControl;

public class Ex6 {
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[1]);
		char c=args[0].charAt(0);
				if(c=='M')
				{
					if(a>=1&&a<=58)
						System.out.println("the percentage of interest is 8.4%.");
					else         
						System.out.println("the percentage of interest is 10.5%.");
						
				}
				else if(c=='F')
				{
					if(a>=1&&a<=58)
						System.out.println("the percentage of interest is 8.2%.");
					else
						System.out.println("the percentage of interest is 9.2%.");
				}
	}

}
