package d0414;

//�θ� �����ڰ� ������ �ڽĿ��� �����ڸ� ȣ�� �ؾߵȴ�

public class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println("�۸�");
	}
	
	public static void main(String[] args) {
		Animal dog = new Dog("����");
		dog.move();
		dog.eat("���");
		dog.makeSound();
	}
}
