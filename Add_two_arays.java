package demo;

public class Add_two_arays {

	public static void main(String[] args) {
	 int a[][]= {{1,2,3},{2,8,9},{4,3,2}};
	 int b[][]= {{2,3,5},{1,8,7},{2,5,0}};
	 int c[][]= new int [3][3];
	 for(int i=0;i<a.length;i++) {
		 for(int j=0;j<a.length;j++) {
			 c[i][j]=a[i][j]+b[i][j];
			 System.out.print(c[i][j]+" ");
		 }
		 System.out.println();
		 
			
		}
	}
	

	}

