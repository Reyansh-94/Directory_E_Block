package P1;

public class Dog implements Animal{

	@Override
	public void Eat() {
		System.out.println("Dog eating...");
		
	}

	@Override
	public void Noise() {
		System.out.println("Bow bow...");
		}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.Eat();
		d.Noise();
	}

}
