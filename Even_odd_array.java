package demo;

public class Even_odd_array {

	public static void main(String[] args) {
		int i,even, odd;
		int arr[]= {2,3,4,56,22,76,9};
		
		for(i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even=arr[i];
				System.out.println(even+"even");
				//stem.out.println(even);
						}
			else {
				odd=arr[i];
				System.out.println(odd+"odd");
			}
		}
		
	}

}
