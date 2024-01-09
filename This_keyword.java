package demo;

public class This_keyword {
		// String name;
		 float per;
		 int roll_no;
		This_keyword(float per,int roll_no){
			 //this.name=name;
			 this.per=per;
			 this.roll_no=roll_no;
		}
void display()
{
	System.out.println(per+roll_no);
}
	public static void main(String[] args) {
		This_keyword t1=new This_keyword(94.5f,5777);
		t1.display();
		

	}

}
