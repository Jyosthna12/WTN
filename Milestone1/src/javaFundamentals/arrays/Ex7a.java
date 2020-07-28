package javaFundamentals.arrays;

public class Ex7a {
	public static void main(String[] args) {
		
      int []a=new int[] {1,3,4,4,6,3};
      int dup=a.length-1;
      for(int i=0;i<a.length;i++)
      {
    	  for(int j=i+1;j<a.length-1;j++)
    	  {
    		  if(a[i]==a[j])  
    		  {
    			  dup--;
    			for(int k=j;k<a.length-1;k++)
    			{
    				a[k]=a[k+1];
    			}
    		  }
    	  }
      }
      for(int i=0;i<dup;i++)
      {
    	  System.out.print(a[i]+"\t");
      }
	}


}
