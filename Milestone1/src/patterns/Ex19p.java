package patterns;

public class Ex19p {
	public static void main(String[] args)
	{
		int n=4;
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<=n-i;k++)
				System.out.print(" ");
			for(int j=0;j<=i;j++)
			{
				System.out.print(n-j);
			}
			System.out.println();
		}
	}

}
