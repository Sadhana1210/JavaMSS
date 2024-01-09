package demo;

public class Prime_array {
	static void prime(int arr[]) {
		int i,j;
		for(i=arr.length-1;i>=0;i--) {
			//System.out.println(arr[i-1]);
			 int count=0;
			for(j=1;j<=i/2;j++) {
				if(i%j==0) {
					count++;
					//System.out.println("HERE:"+arr[i]);
				}}
				if(count==1) {
					System.out.println("Prime"+arr[i]);
				}
				else {
					System.out.println("Not prime"+arr[i]);
				}
			}
	}
	public static void main(String[] args) {
		int arr[]= {2,3,4,5};
		
		prime(arr);
		
		
	}

}









