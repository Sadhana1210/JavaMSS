package demo;

public class Array_instialization {

	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[1]=10;
		arr[2]=43;
		arr[3]=34;
		arr[0]=76;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		}

}
