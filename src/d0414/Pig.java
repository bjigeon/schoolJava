package d0414;

public class Pig extends Animal {
	public Pig(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println("�ܲ�");
	}
	
	public static void main(String[] args) {
		Animal cat = new Cat("����");
		
		cat.move();
		cat.eat("�");
		cat.makeSound();
	}
}
