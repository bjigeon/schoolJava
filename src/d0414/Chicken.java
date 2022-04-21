package d0414;

public class Chicken extends Animal {
	public Chicken(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println("������");
	}
	
	public static void main(String[] args) {
		Animal cat = new Cat("��");
		
		cat.move();
		cat.eat("���");
		cat.makeSound();
	}
}
