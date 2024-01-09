package demo;

public class Merge_array {

	public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int b[]= {9,8,7,6};
	int c[]=new int[a.length+b.length];
	int i,j;
	for( i=0;i<a.length;i++)
		{
		c[i]=a[i];
	    // System.out.print(a[i]);
	}
	
	int n=0;
	for( j=a.length;j<c.length;j++)
	{     
		c[j]=b[n];
		n++;
	}
//	c[]=a[i]+b[j];
	
	for(int k:c) {
		System.out.print(k+" ");
	}
System.out.println();
	}
}

