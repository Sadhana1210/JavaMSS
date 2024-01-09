package demo;

public class Reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {23,45,6,78,9};
for(int b:arr) {
	System.out.println("Array"+b);}
System.out.println("Reverse");
	for(int i=arr.length;i>0;i--) {
		System.out.println(arr[i-1]);
}

	}

}
