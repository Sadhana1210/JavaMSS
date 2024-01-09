package demo;

public class Occurance_of_elemnets {

	public static void main(String[] args) {
		int i,j;
		//int visited=-1;
		int count=0;
 int arr[]= {1,3,4,6,2,1,2};
 int occ[]=new int [arr.length];
 for(i=0;i<arr.length;i++) {
	// System.out.println(arr[i]);}
 for(j=0;j<arr.length-1;j++) {
	if(arr[j]==arr[i])
		count++;
	//occ[j]=visited;
	}
// if(occ[j]!=visited) {
	 occ[j]=count;
// }
 for(i=0;i<occ[j];i++)
 System.out.println("Occarance of"+arr[i]+"is"+occ[j]);
 }}
}
	


