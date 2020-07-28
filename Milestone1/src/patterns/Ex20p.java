package patterns;

public class Ex20p {
	public static void main(String[] args)
	{
		int n=4;
		for(int i=0;i<n;i++)
		{
			for(int k=1;k<=n-i;k++)
				System.out.print(" ");
			for(int j=n-i;j<=n;j++)
			{
				System.out.print(n-j+1);
			}
			System.out.println();

}
	}
}

