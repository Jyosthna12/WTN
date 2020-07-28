package javaFundamentals.flowControl;

public class Ex5 {
	public static void main(String[] args)
	{
		char a=args[0].charAt(0);
		if(a>='0'&&a<='9')
			System.out.println("Digit");
		else if(a>='a'&&a<='z'||a>='A'&&a<='z')
		{
			System.out.println("Alphabet");
			
		}
		else
			System.out.println("Special Charcter");
			
	}


}
