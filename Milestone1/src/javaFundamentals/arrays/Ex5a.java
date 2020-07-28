package javaFundamentals.arrays;

public class Ex5a {
	public static void main(String[] args)
	{
		int a[]=new int[] {1,5,3,2,4};
		int max=0,max1=0,min=999,min1=999;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				
			}
			if(max1<a[i]&&max!=a[i])
			{
				max1=a[i];
				
			}
			if(min>a[i])

	
				{
				min=a[i];
				}
			if(min1>a[i]&&min!=a[i])
			{
				min1=a[i];
				
			}
			}
		System.out.println(max+" "+max1+" "+min+" "+min1);
		
			
		}
	
}
