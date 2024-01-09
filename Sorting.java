package demo;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int temp=0;int i;
      int arr[]=new int[] {41,56,89,23,14,154,5};
      for( i=0;i<arr.length;i++)
      {
      System.out.println(arr[i]);}
      for( i=0;i<arr.length;i++)
      {
    	  //System.out.println(arr[i]);
      
	       for(int j=i+1;j<arr.length;j++)
	         {
	        	if(arr[i]>arr[j])
	        			{
		                 	temp=arr[i];
			                 arr[i]=arr[j];
                   			arr[j]=temp;
		                 }
	                                           }
	                                                }
      System.out.println("Sorted elements");
      for(i=0;i<arr.length;i++) {
    	  System.out.println(arr[i]);
      }
}
	}

