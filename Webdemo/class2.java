package P1;

public class class2 implements inter2{

	@Override
	public void test2() {
		System.out.println("Preetam Singh");
		
	}

	@Override
	public void test1() {
		System.out.println("Sonal Singh");		
	}
public static void main(String[] args) {
	class2 c = new class2();
	c.test1();
	c.test2();
	
}
}
