package javaFundamentals.arrays;

public class Ex2a {
	public static void main(String[] args)
	{
		int a[]=new int[] {25,56,4,54,99};
		
		int minimum=a[0];
		int maximum=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<minimum)
			{
				minimum=a[i];
			}
			if(a[i]>maximum)
			{
				maximum=a[i];
			}
			
		}
		System.out.println(minimum+","+maximum);
		}
		

}
