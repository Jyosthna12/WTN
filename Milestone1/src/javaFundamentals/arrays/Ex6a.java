package javaFundamentals.arrays;

public class Ex6a {
	public static void main(String[] args)
	{
		int []a=new int[] {1,8,3,9,4,6};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
			if(a[j]>a[j+1])
			{
				a[j]=a[j]+a[j+1];
				a[j+1]=a[j]-a[j+1];
				a[j]=a[j]-a[j+1];
				
			}
				
			}
		}  
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
			
		}

}
