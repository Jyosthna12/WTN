package javaFundamentals.arrays;

public class Expbl9a {
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    int []a=new int[] {1,3,10};
	    for(int i=0;i<a.length;i++)
	    {
	      if(a[i]==10)
	      {
	        a[i]=0;
	        for(int j=i;j<a.length-1;j++)
	        {
	          a[j]=a[j]+a[j+1];
	          a[j+1]=a[j]-a[j+1];
	          a[j]=a[j]-a[j+1];
	        }
	      }
	    }
	    for(int i=0;i<a.length;i++)
	      System.out.println(a[i]);
	  }

	

}
