package demo;

public class Even_position_array {

	public static void main(String[] args) {
		int i,j;
		int ar[]= {23,45,65,67,87};
		System.out.println("odd places");
		for( i=0;i<ar.length;i+=2) {
			
			System.out.println(ar[i]);
			//System.out.println("odd places"+a[i]);
		}
		System.out.println("Even places");
	for( j=1;j<ar.length;j+=2) {
			System.out.println(ar[j]);
			}
		
	}

}
