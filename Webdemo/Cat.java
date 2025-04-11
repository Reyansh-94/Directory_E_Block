package P1;

public class Cat implements Animal{

	public void Eat() {
		System.out.println("Cat eating...");		
	}

	public void Noise() {
		System.out.println("Cat mew mow...");
		
	}
public static void main(String[] args) {
	Cat C = new Cat();
	C.Eat();
	C.Noise();
	System.out.println("Hackathone system");
}

}
