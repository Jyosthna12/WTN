package javaFundamentals.arrays;

public class Ex1a {
	public static void main(String[] args)
	{
		int []elements=new int[] {1,2,3,4,5};
		int len=elements.length;
		int sum=0;
		for(int i=0;i<len;i++)
		{
			sum=sum+elements[i];
		}
		System.out.println("The sum of elememts in array is "+sum);
		System.out.println("The average of elememts in array is "+(sum/len));
		
		
		}
	}

    