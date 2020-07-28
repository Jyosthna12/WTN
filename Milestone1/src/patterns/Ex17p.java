package patterns;

public class Ex17p {
	public static void main(String[] args)
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<=n-i;k++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
