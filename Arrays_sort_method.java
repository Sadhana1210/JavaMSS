package demo;

import java.util.Arrays;

public class Arrays_sort_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]= {34,56,76,23,4,1,2,78,9};
System.out.println("Befor sorting:");
for(int a:ar) {
	System.out.println(a);
}
	Arrays.sort(ar);
	System.out.println("After sorting: ");
	for(int b:ar) {
	System.out.println(b);
}

	}

	
}
