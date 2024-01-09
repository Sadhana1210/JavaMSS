package demo;

public class Copy_arrayelements {

	public static void main(String[] args) {
		int i,j;
		int arr[]={1,34,5,6,87};
		for(i=0;i<arr.length;i++) {
			System.out.println("enter elements"+arr[i]);
		}
		int arr1[]=new int[arr.length];{
			for( i=0;i<arr.length;i++)
			{
				arr1[i]=arr[i];
				System.out.println("Elements after coping"+arr1[i]);
			}
			
		}
		
		

	}

}
