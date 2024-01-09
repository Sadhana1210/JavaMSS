package demo;
public class Passing_array_formethod_Anonymous {
static void print_array(int a[]){
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);}
	}
public static void main(String[] args) {
	print_array( new int [] {4,5,6,7});
	
			}
}
