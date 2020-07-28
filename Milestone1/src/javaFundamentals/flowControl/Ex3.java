package javaFundamentals.flowControl;

public class Ex3 {
public static void main(String[] args)
{
	if(args.length>0)
	{
		int i;
		for(i=0;i<args.length-1;i++)
			System.out.print(args[i]+",");
		System.out.print(args[i]);
	}
	else
		System.out.print("No values");
			
			
	}
}
