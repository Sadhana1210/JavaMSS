package demo;

public class A_class {
	void m() {
		System.out.println("Hi");
	}
void n() {
	System.out.println("Hello");
	m();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_class s=new A_class();
		s.n();
		//s.m();

	}

}
