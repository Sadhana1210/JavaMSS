package demo;
import java.util.*;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int r=0,temp;
int arr[]= {272,376,212};
for(i=0;i<arr.length;i++) {
	temp=arr[i];
	int sum=0;
	while(arr[i]>0) {
	r=arr[i]%10;
	sum=(sum*10)+r;
	arr[i]=arr[i]/10;
}
	if(sum==temp) {
		System.out.println("palindrom"+temp);
	}
	else {
		System.out.println("not palindrom"+temp);
	}
	}

}
}

