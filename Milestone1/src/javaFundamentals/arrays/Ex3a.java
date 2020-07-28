package javaFundamentals.arrays;

public class Ex3a {
	public static void main(String[] args)
	{
		int []a=new int[]{1,4,34,56,7};
		int num=Integer.parseInt(args[0]);
		int i;
		
		for(i=0;i<a.length;i++)
		{
			if(num==a[i])
			{
				System.out.println(i);
				break;
				
			}
		}
		if(i==a.length) 
		
			System.out.println(-1);
			
		}
	}
	
