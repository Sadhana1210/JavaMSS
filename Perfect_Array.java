package demo;

public class Perfect_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]={1,2,3,4,5,6};
		int sum=0;
		for(int a:ar) {
		//	System.out.println(a);
			
			for(int i=1;i<a/2;i++) {
				if(ar[i]%i==0) {
					sum=sum+ar[i];
			}
			}
			//System.out.println(sum);
				if(sum==a) {
					System.out.println("perfect"+a);
				}
				else
				{
					System.out.println("not"+a);
				}
				
			}
		
		

	}

}
