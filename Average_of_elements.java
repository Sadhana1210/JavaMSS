package demo;

public class Average_of_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,4,5,6,78,9,12};
int sum=0,avg=0;
for(int b:arr) {
	sum=sum+b;
	avg=sum/arr.length;
	
}
System.out.println("sum is"+sum);
System.out.println("average is"+avg);
	}

}
