package demo;

public class Largest_num {

	public static void main(String[] args) {
		int max=0;
		// TODO Auto-generated method stub
      int arr[]= {12,56,77,25,45};
      for(int i=0;i<arr.length;i++)
      {
    	  if(arr[i]>max) {
    		  max=arr[i];
    	  }
      }
      
      System.out.println("Largest number is :"+max);
      
	}

}
